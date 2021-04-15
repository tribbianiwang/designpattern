package designpattern.factory.abstractfactory;

import designpattern.factory.Pizza;
import designpattern.factory.factorymethod.LdCheesePizza;
import designpattern.factory.factorymethod.LdPepperPizza;

public class LDFactory extends AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType!=null&&orderType!=""){
            if(orderType.equals("cheese")){
                pizza = new LdCheesePizza();
                pizza.setName("伦敦芝士披萨");
            }else if(orderType.equals("pepper")){
                pizza = new LdPepperPizza();
                pizza.setName("伦敦辣椒披萨");
            }
        }
        return pizza;

    }
}
