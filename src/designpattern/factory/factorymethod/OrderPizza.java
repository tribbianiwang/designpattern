package designpattern.factory.factorymethod;

import designpattern.factory.simplefactory.CheesePizza;
import designpattern.factory.simplefactory.GreekPizza;
import designpattern.factory.simplefactory.PepperPizza;
import designpattern.factory.simplefactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public abstract Pizza createPizza(String orderType);


    public void startOrderPizza(){
        String orderType;
        Pizza pizza = null;

        do {
            orderType = getType();
            if(orderType!=null&&orderType!=""){
                 pizza =createPizza(orderType);
                if(pizza!=null){
                    pizza.prepare();
                    pizza.cut();
                    pizza.bake();
                    pizza.box();
                }else{
                    break;
                }

            }

        }while (true);

    }


    private String getType() { try {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in)); System.out.println("input pizza 种类:");
        String str = strin.readLine();
        return str;
    } catch (IOException e) { e.printStackTrace(); return "";
    }
    }
}
