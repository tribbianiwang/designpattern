package designpattern.factory.abstractfactory;

import designpattern.factory.Pizza;

public class LdCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦芝士匹萨...准备中...");
    }
}
