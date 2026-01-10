package patterns.adapter;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quck() {
        turkey.gobble();
    }

    @Override
    public void fiy() {
        turkey.fly();
    }
}
