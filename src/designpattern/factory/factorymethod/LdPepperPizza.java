package designpattern.factory.factorymethod;

import designpattern.factory.simplefactory.Pizza;

public class LdPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦胡椒匹萨...准备中...");
    }
}
