package patterns.templateMethod;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCop();
        addCondiments();
    }

    public abstract void brew();

    public void addCondiments() {
        System.out.println("adding syrup");
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCop() {
        System.out.println("pouring in cop");
    }
}
