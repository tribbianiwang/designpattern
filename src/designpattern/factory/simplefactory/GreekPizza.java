package designpattern.factory.simplefactory;

import designpattern.factory.Pizza;

public class GreekPizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("希腊pizza正在准备");
    }
}
