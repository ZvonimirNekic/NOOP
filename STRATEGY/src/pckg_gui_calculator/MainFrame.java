package pckg_gui_calculator;

import pckg_gui_calculator.load_strategies.LoadBinStrategy;
import pckg_gui_calculator.load_strategies.LoadTxtStrategy;
import pckg_gui_calculator.save_strategies.SaveBinStrategy;
import pckg_gui_calculator.save_strategies.SaveTxtStrategy;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    private final List<String> txtData;
    private final List<CalculationFormData> objData;

    public MainFrame(){
        super("Simple calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);

        this.txtData = new ArrayList<>();
        this.objData = new ArrayList<>();

        initComps();
        layoutComps();
        activateComps();
    }
    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void activateComps() {
        formPanel.setFormPanelListener(new FormPanelListener() { //anonimna klasa
            @Override
            public void formPanelEventOccured(CalculationFormData formRecord) {
                viewPanel.addTextToViewPanel(formRecord);
                txtData.add(formRecord.toString());
                objData.add(formRecord);
            }
        });

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolbarEventOccured(String buttonActionString) {
                if (buttonActionString.equals("saveTxt")){
                    saveText();
                }
                if (buttonActionString.equals("loadTxt")){
                    loadText();
                }
                if (buttonActionString.equals("saveBin")){
                    saveBin();
                }
                if (buttonActionString.equals("loadBin")) {
                    loadBin();
                }

                if (buttonActionString.equals("clearAll")){
                    viewPanel.clearTextArea();
                    formPanel.clearForm();
                    txtData.clear();
                    objData.clear();
//                    JOptionPane.showMessageDialog(MainFrame.this, "List is emptied", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    private void saveText(){
        SaveTxtStrategy saveTxtStrategy = new SaveTxtStrategy();
        String filePath = getFilePath(true, "txt");
        if (filePath == null) {
            System.out.println("User canceled save dialog");
            return;
        }
        saveTxtStrategy.saveDataToFile(filePath, txtData);
        JOptionPane.showMessageDialog(MainFrame.this, "Data saved as text!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void loadText(){
        if (!viewPanel.getTextAreaData().isEmpty() && viewPanel.getTextAreaData()!=null){
            if (JOptionPane.showConfirmDialog(MainFrame.this, "Would you like to save the current data before loading new data?", "Warning msg", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                saveText();
                JOptionPane.showMessageDialog(MainFrame.this, "Proceed to load a file...", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        viewPanel.clearTextArea();
        txtData.clear();
        objData.clear();
        LoadTxtStrategy loadTxtStrategy = new LoadTxtStrategy();
        String filePath = getFilePath(false, "txt");
        if (filePath == null) {
            System.out.println("User canceled load dialog");
            return;
        }
        List<String> loaded = loadTxtStrategy.loadDataFromFile(filePath);
        for (String element: loaded) {
            viewPanel.addTextToViewPanel(element);
        }
        txtData.addAll(loaded);
    }

    private void saveBin(){
        SaveBinStrategy saveBinStrategy = new SaveBinStrategy();
        String filePath = getFilePath(true, "bin");
        if (filePath == null) {
            System.out.println("User canceled save dialog");
            return;
        }
        saveBinStrategy.saveDataToFile(filePath, objData);
        JOptionPane.showMessageDialog(MainFrame.this, "Data saved as binary!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void loadBin(){
        if (!viewPanel.getTextAreaData().isEmpty() && viewPanel.getTextAreaData()!=null){
            if (JOptionPane.showConfirmDialog(MainFrame.this, "Would you like to save the current data before loading new data?", "Warning msg", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                saveBin();
                JOptionPane.showMessageDialog(MainFrame.this, "Proceed to load a file...", "Warning msg", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        viewPanel.clearTextArea();
        txtData.clear();
        objData.clear();

        LoadBinStrategy loadBinStrategy = new LoadBinStrategy();
        String filePath = getFilePath(false, "bin");
        if (filePath == null) {
            System.out.println("User canceled load dialog");
            return;
        }
        List<CalculationFormData> loaded = loadBinStrategy.loadDataFromFile(filePath);
        for (CalculationFormData element : loaded) {
            viewPanel.addTextToViewPanel(element);
        }
        objData.addAll(loaded);
    }


    private String getFilePath(boolean saveDialog, String fileExtension) {
    JFileChooser fileChooser = new JFileChooser("./DATA");
    if (fileExtension != null) {
        fileChooser.setFileFilter(new FileNameExtensionFilter(fileExtension.toUpperCase() + " files", fileExtension));
    }
    int result;
    if (saveDialog) {
        result = fileChooser.showSaveDialog(this);
    } else {
        result = fileChooser.showOpenDialog(this);
    }
    if (result == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        if (fileExtension != null && !filePath.endsWith("." + fileExtension)) {
            filePath += "." + fileExtension;
        }
        return filePath;
    }
    return null;
}

}
