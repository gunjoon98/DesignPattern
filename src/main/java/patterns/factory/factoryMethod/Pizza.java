package patterns.factory.factoryMethod;

public abstract class Pizza {
    protected String name;
    protected String sauce;
    protected String dough;

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Sauce: " + sauce);
        System.out.println("Dough: " + dough);
    }

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }
}
