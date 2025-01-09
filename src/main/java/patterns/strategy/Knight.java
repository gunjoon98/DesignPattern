package patterns.strategy;

public class Knight extends Character {

    public Knight(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("Night fight");
        weaponBehavior.useWeapon();
    }
}
