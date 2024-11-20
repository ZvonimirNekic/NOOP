package pckg_gui_calculator.calc_strategies;

public class AddCalcStrategy implements CalculationStrategy {

    @Override
    public double performCalculation(double fst, double snd) {
        return fst + snd;
    }

    @Override
    public String toString() {
        return "Addition";
    }
}