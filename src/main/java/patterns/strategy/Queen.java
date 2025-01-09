package patterns.strategy;

public class Queen extends Character {

    public Queen(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("Queen fight");
        weaponBehavior.useWeapon();
    }
}
