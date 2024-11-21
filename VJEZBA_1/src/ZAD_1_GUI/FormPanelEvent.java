package ZAD_1_GUI;

import java.util.EventObject;

public class FormPanelEvent extends EventObject {
    private float firstNumber;
    private float secondNumber;
    private String operation;

    public FormPanelEvent(Object source, float firstNumber, float secondNumber, String operation) {
        super(source);
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public String getOperation() {
        return operation;
    }
}
