package designpattern.factory.simplefactory;

import designpattern.factory.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;

            if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("芝士披萨");

            }else if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName("辣椒披萨");
            }
        return pizza;
    }

    public static Pizza createPizzaStatic(String orderType){
        Pizza pizza = null;

        if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");

        }else if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("辣椒披萨");
        }
        return pizza;
    }
}
