package designpattern.decorator;

public class DrinkShop {
    public static void main(String[] args) {
        Drink drink = new ShortBlack();

        System.out.println(drink.getDescribe()+drink.cost());

        drink = new Milk(drink);

        System.out.println(drink.getDescribe()+drink.cost());

        drink = new Chocolate(drink);
        System.out.println(drink.getDescribe()+drink.cost());
    }
}
