package patterns.templateMethod;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
