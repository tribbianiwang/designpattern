package designpattern.factory.simplefactory;

import designpattern.factory.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("芝士pizza正在准备");
    }
}
