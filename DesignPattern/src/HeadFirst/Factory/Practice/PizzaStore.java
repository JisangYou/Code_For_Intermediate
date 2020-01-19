package HeadFirst.Factory.Practice;

public abstract class PizzaStore {
//    SimplePizzaFactory factory;
//
//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
//        pizza = factory.createPizza(type);
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
