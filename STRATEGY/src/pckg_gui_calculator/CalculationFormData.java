package pckg_gui_calculator;

import pckg_gui_calculator.calc_strategies.CalculationStrategy;

import java.io.Serializable;

public record CalculationFormData (double fst, double snd, double result, CalculationStrategy calculationStrategy) implements Serializable {

    @Override
    public String toString() {
        return "CalculationFormData{" +
                "fst=" + fst +
                ", snd=" + snd +
                ", result=" + result +
                ", calculationStrategy=" + calculationStrategy +
                '}';
    }

}
