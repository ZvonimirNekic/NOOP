package ZAD_3;

public class FreezeBreathStrategy implements AbilityStrategy{
    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
        System.out.println("I am freezing with my breath!");
    }
}
