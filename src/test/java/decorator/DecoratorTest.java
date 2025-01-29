package decorator;

import patterns.decorator.Beverage;
import patterns.decorator.Espresso;
import patterns.decorator.Mocha;
import patterns.decorator.Soy;

public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
