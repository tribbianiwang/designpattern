package designpattern.factory.simplefactory;

public class GreekPizza extends Pizza{


    @Override
    public void prepare() {
        System.out.println("希腊pizza正在准备");
    }
}
