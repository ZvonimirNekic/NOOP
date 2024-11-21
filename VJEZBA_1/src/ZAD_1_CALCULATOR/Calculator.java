package ZAD_1_CALCULATOR;

public abstract class Calculator {
    protected CalculationStrategy strategy;

    public Calculator() {
    }
    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void display(float rez) {
        System.out.println("Rezultat je: " + rez);
    }

    abstract protected float performCalculation(float a, float b);


}
