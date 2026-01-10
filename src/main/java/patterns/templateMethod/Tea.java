package patterns.templateMethod;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("brewing Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }
}
