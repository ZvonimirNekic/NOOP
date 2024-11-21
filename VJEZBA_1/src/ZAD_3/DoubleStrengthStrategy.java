package ZAD_3;

public class DoubleStrengthStrategy implements AbilityStrategy{
    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
        System.out.println("I have double strength!");
    }
}
