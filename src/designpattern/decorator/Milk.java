package designpattern.decorator;

public class Milk extends Decorator{


    public Milk(Drink drink) {
        super(drink);
        setDescribe("加牛奶");
        setPrice(3.0f);
    }
}
