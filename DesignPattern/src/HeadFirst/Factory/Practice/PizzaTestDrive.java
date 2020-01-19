package HeadFirst.Factory.Practice;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

//        pizza = chicagoStore.orderPizza("veggie");
//        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
