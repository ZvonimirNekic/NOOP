package ZAD_3;

public class FlyingStrategy implements AbilityStrategy{

    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
        System.out.println("I am flying!");
    }
}
