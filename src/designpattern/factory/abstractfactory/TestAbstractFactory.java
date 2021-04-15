package designpattern.factory.abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
        orderPizza.startOrderPizza();
    }
}
