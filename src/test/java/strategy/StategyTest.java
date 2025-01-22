package strategy;

import patterns.strategy.Character;
import patterns.strategy.KnifeBehavior;
import patterns.strategy.Knight;
import patterns.strategy.SwordBehavior;

public class StategyTest {
    public static void main(String[] args) {
        Character character = new Knight(new KnifeBehavior());
        character.fight();

        character.setWeaponBehavior(new SwordBehavior());
        character.fight();
    }
}
