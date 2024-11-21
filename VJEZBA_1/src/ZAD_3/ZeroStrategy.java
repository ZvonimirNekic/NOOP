package ZAD_3;

public class ZeroStrategy implements AbilityStrategy{
    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
        System.out.println("I have no special abilities.");
        System.out.println("I can walk and run normally.");
    }
}
