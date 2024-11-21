package ZAD_3;

/**
 * Klasa Hero koja može imati različite sposobnosti.
 */
public class Hero {

    private AbilityStrategy abilityStrategy;

    /**
     * Konstruktor koji inicijalizira heroja bez posebnih sposobnosti.
     */
    public Hero() {
        this.abilityStrategy = new ZeroStrategy();
    }

    /**
     * Postavlja i primjenjuje novu strategiju sposobnosti.
     *
     * @param abilityStrategy nova strategija sposobnosti
     */
    public void setAndApplyAbilityStrategy(AbilityStrategy abilityStrategy) {
        this.abilityStrategy = abilityStrategy;
        abilityStrategy.applyAbility();
    }

    @Override
    public String toString() {
        if (this.abilityStrategy instanceof ZeroStrategy) {
            return "This is not a hero, but an average person...";
        } else {
            return "Hero with ability: " + abilityStrategy.getClass().getSimpleName();
        }
    }
}
