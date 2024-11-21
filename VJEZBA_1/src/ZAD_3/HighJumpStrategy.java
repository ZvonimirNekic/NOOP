package ZAD_3;

public class HighJumpStrategy implements AbilityStrategy{
    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
        System.out.println("I am jumping high!");
    }
}
