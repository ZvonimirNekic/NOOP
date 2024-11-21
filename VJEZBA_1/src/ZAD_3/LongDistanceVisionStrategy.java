package ZAD_3;

public class LongDistanceVisionStrategy implements AbilityStrategy {
    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
        System.out.println("I can see far distances!");
    }
}
