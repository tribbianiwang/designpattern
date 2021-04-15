package designpattern.factory.factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
//        OrderPizza orderPizza = new BjOrderPizza();
        OrderPizza orderPizza = new LdOrderPizza();
        orderPizza.startOrderPizza();
    }
}
