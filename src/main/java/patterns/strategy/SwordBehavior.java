package patterns.strategy;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("use Sword");
    }
}
