package designpattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {


    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void startOrderPizza(){
        String orderType;
         Pizza pizza = null;

        do {
            orderType = getType();
            if(orderType!=null&&orderType!=""){
                if(orderType.equals("cheese")){
                    pizza = new CheesePizza();
                    pizza.setName("芝士披萨");
                }else if(orderType.equals("greek")){
                    pizza = new GreekPizza();
                    pizza.setName("希腊披萨");
                }else if(orderType.equals("pepper")){
                    pizza = new PepperPizza();
                    pizza.setName("辣椒披萨");
                }else{
                    break;
                }
                if(pizza!=null){
                    pizza.prepare();
                    pizza.cut();
                    pizza.bake();
                    pizza.box();
                }

            }


        }while (true);





    }

    private SimpleFactory simpleFactory;


    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void StartOrderPizzaSimpleFactory(){
        String orderType;
        Pizza pizza = null;

        do {
            orderType = getType();
            if(orderType!=null&&orderType!=""){

                pizza = SimpleFactory.createPizzaStatic(orderType);

                if(pizza!=null){
                    pizza.prepare();
                    pizza.cut();
                    pizza.bake();
                    pizza.box();
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
