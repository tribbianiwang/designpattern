package designpattern.factory.factorymethod;

import designpattern.factory.simplefactory.CheesePizza;
import designpattern.factory.simplefactory.GreekPizza;
import designpattern.factory.simplefactory.PepperPizza;
import designpattern.factory.simplefactory.Pizza;

public class BjOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType!=null&&orderType!=""){
            if(orderType.equals("cheese")){
                pizza = new BJCheesePizza();
                pizza.setName("北京芝士披萨");
            }else if(orderType.equals("pepper")){
                pizza = new BJPepperPizza();
                pizza.setName("北京辣椒披萨");
            }
        }
        return pizza;
    }

}
