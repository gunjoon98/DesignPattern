package patterns.factory.simpleFactory;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Box Cheese Pizza");
    }
}
