package designpattern.decorator;

public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        setDescribe("加豆浆");
        setPrice(1.5f);
    }
}
