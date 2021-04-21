package designpattern.decorator;

public abstract class Drink {

    private String describe;
    private float price;

    public abstract float cost();


    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



}
