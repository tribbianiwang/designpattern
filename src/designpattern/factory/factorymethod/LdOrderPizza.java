package designpattern.factory.factorymethod;

import designpattern.factory.simplefactory.Pizza;

public class LdOrderPizza extends OrderPizza{
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
