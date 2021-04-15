package designpattern.factory.abstractfactory;


import designpattern.factory.Pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("北京胡椒匹萨...准备中");
    }
}
