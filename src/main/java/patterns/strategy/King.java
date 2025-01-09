package patterns.strategy;

public class King extends Character {

    public King(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("King fight");
        weaponBehavior.useWeapon();
    }
}