package ZAD_1_CALCULATOR;

public class MultiplyStrategy implements CalculationStrategy {
    @Override
    public float calculate(float a, float b) {
        return a * b;
    }
}
