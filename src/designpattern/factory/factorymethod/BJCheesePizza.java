package designpattern.factory.factorymethod;

import designpattern.factory.simplefactory.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("北京芝士匹萨...准备中");
    }
}
