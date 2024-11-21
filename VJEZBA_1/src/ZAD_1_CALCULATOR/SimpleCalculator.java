package ZAD_1_CALCULATOR;

public class SimpleCalculator extends Calculator{
    public SimpleCalculator() {

    }
    @Override
    public float performCalculation(float a, float b) {
        return strategy.calculate(a, b);
    }
}
