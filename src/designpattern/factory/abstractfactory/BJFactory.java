package designpattern.factory.abstractfactory;

import designpattern.factory.Pizza;
import designpattern.factory.factorymethod.BJCheesePizza;
import designpattern.factory.factorymethod.BJPepperPizza;

public class BJFactory extends AbstractFactory{
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
