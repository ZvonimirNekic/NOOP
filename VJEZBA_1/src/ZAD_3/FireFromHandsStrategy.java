package ZAD_3;

public class FireFromHandsStrategy implements AbilityStrategy{
    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
        System.out.println("I am shooting fire from my hands!");
    }
}
