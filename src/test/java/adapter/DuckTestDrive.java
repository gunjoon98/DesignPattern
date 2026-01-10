package adapter;

import patterns.adapter.*;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.fiy();
        turkeyAdapter.quck();
    }
}
