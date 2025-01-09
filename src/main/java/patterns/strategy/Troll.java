package patterns.strategy;

public class Troll extends Character {

    public Troll(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("Troll fight");
        weaponBehavior.useWeapon();
    }
}
