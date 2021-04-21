package designpattern.decorator;

public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDescribe("巧克力");
        setPrice(2);
    }

}
