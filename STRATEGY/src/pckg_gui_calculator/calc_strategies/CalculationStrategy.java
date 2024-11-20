package pckg_gui_calculator.calc_strategies;

import java.io.Serializable;

public interface CalculationStrategy extends Serializable {

    double performCalculation(double fst, double snd);
}
