package ZAD_1_CALCULATOR;

public class PowStrategy implements CalculationStrategy{
    @Override
    public float calculate(float a, float b) {
        return (float) Math.pow(a, b);
    }
}
