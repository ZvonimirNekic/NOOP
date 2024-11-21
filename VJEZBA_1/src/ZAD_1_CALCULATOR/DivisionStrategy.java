package ZAD_1_CALCULATOR;

public class DivisionStrategy implements CalculationStrategy{
    @Override
    public float calculate(float a, float b) {
        if(b == 0) {
            throw new IllegalArgumentException("Dijeljenje s nulom nije dozvoljeno");
        }else {
            return a / b;
        }

    }
}
