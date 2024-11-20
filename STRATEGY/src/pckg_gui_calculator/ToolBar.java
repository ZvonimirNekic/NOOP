package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton saveAsText;
    private JButton saveObject;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;
    private ToolBarListener toolBarListener;

    public ToolBar() {
        initComps();
        layoutComps();
        activateToolbar();
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    private void initComps() {
        this.saveAsText = new JButton("Save txt");
        this.saveObject = new JButton("Save bin");
        this.loadText = new JButton("Load txt");
        this.loadObjects = new JButton("Load bin");
        this.clearAll = new JButton("Clear all");

    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsText);
        add(saveObject);
        add(loadText);
        add(loadObjects);
        add(clearAll);

    }

    private void activateToolbar() {
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("saveTxt");

        saveObject.addActionListener(this);
        saveObject.setActionCommand("saveBin");

        loadText.addActionListener(this);
        loadText.setActionCommand("loadTxt");

        loadObjects.addActionListener(this);
        loadObjects.setActionCommand("loadBin");

        clearAll.addActionListener(this);
        clearAll.setActionCommand("clearAll");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == saveAsText) {
            System.out.println("Clicked: " + saveAsText.getActionCommand());
            if (toolBarListener != null) {
                toolBarListener.toolbarEventOccured(saveAsText.getActionCommand());
            }
        }

        if (ae.getSource() == saveObject) {
            System.out.println("Clicked: " + saveObject.getActionCommand());
            if (toolBarListener != null) {
                toolBarListener.toolbarEventOccured(saveObject.getActionCommand());
            }
        }

        if (ae.getSource() == loadText) {
            System.out.println("Clicked: " + loadText.getActionCommand());

            if (toolBarListener != null) {
                toolBarListener.toolbarEventOccured(loadText.getActionCommand());
            }
        }

        if (ae.getSource() == loadObjects) {
            System.out.println("Clicked: " + loadObjects.getActionCommand());
            if (toolBarListener != null) {
                toolBarListener.toolbarEventOccured(loadObjects.getActionCommand());
            }
        }

        if (ae.getSource() == clearAll) {
            System.out.println("Clicked: " + clearAll.getActionCommand());
            if (toolBarListener != null) {
                toolBarListener.toolbarEventOccured(clearAll.getActionCommand());
            }
        }
    }
}
