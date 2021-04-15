package designpattern.factory.simplefactory;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("芝士pizza正在准备");
    }
}
