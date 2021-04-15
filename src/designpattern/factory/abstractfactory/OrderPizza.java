package designpattern.factory.abstractfactory;

import designpattern.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbstractFactory pizzaFactory;

    public OrderPizza(AbstractFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void startOrderPizza(){
        String orderType;
        Pizza pizza = null;

        do {
            orderType = getType();
            if(orderType!=null&&orderType!=""){
                pizza =pizzaFactory.createPizza(orderType);
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
