package ZAD_1_CALCULATOR;

public class SubsStrategy implements CalculationStrategy{
    @Override
    public float calculate(float a, float b) {
        return a - b;
    }
}
