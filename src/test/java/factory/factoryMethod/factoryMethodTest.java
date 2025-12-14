package factory.factoryMethod;

import patterns.factory.factoryMethod.NYPizzaStore;
import patterns.factory.factoryMethod.PizzaStore;

public class factoryMethodTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
    }
}
