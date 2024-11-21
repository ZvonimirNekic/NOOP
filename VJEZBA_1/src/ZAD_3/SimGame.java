package ZAD_3;

/**
 * Simulacijska klasa za igru SuperHero.
 */
public class SimGame {

    public static void main(String[] args) {
        // Kreiramo novog heroja
        Hero hero = new Hero();

        // Prikazujemo početno stanje
        System.out.println(hero.toString());
        hero.setAndApplyAbilityStrategy(new ZeroStrategy());

        // Nivo 1: Heroj dobiva sposobnost brzog trčanja
        System.out.println("\nLevel up! Hero gains FastRunning ability.");
        hero.setAndApplyAbilityStrategy(new FastRunningStrategy());
        System.out.println(hero.toString());

        // Nivo 2: Heroj dobiva sposobnost letenja
        System.out.println("\nLevel up! Hero gains Flying ability.");
        hero.setAndApplyAbilityStrategy(new FlyingStrategy());
        System.out.println(hero.toString());

        // Nivo 3: Heroj dobiva sposobnost dvostruke snage
        System.out.println("\nLevel up! Hero gains DoubleStrength ability.");
        hero.setAndApplyAbilityStrategy(new DoubleStrengthStrategy());
        System.out.println(hero.toString());

        // Nivo 4: Heroj dobiva sposobnost visokog skoka
        System.out.println("\nLevel up! Hero gains HighJump ability.");
        hero.setAndApplyAbilityStrategy(new HighJumpStrategy());
        System.out.println(hero.toString());

        // Nivo 5: Heroj dobiva sposobnost ledenog daha
        System.out.println("\nLevel up! Hero gains FreezeBreath ability.");
        hero.setAndApplyAbilityStrategy(new FreezeBreathStrategy());
        System.out.println(hero.toString());

        // Nivo 6: Heroj dobiva sposobnost ispaljivanja vatre iz ruku
        System.out.println("\nLevel up! Hero gains FireFromHands ability.");
        hero.setAndApplyAbilityStrategy(new FireFromHandsStrategy());
        System.out.println(hero.toString());

        // Nivo 7: Heroj dobiva sposobnost dalekovidnosti
        System.out.println("\nLevel up! Hero gains LongDistanceVision ability.");
        hero.setAndApplyAbilityStrategy(new LongDistanceVisionStrategy());
        System.out.println(hero.toString());
    }
}
