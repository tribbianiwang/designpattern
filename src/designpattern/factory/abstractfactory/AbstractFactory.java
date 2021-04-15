package designpattern.factory.abstractfactory;

import designpattern.factory.Pizza;

public abstract class AbstractFactory{

    public abstract Pizza createPizza(String orderType);
}
