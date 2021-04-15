package designpattern.factory.simplefactory;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("胡椒pizza正在准备");
    }
}
