package designpattern.factory.abstractfactory;

import designpattern.factory.Pizza;

public class LdPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦胡椒匹萨...准备中...");
    }
}
