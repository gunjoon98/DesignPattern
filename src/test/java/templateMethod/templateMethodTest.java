package templateMethod;

import patterns.templateMethod.Coffee;
import patterns.templateMethod.Tea;

public class templateMethodTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
