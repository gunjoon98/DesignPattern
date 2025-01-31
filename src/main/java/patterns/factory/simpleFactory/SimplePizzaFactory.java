package patterns.factory;

public class SimplePizzaFactory {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("veggie")) {
            pizza = new VegggiePizza();
        }
        return pizza;
    }
}