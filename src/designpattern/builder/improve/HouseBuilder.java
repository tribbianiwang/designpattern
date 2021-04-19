package designpattern.builder.improve;

public abstract class HouseBuilder {
    private House house = new House();

    public abstract void buildBasics();

    public abstract void buildWalls();

    public abstract void roofed();

    public House  build(){
        return getHouse();
    }

    public House getHouse() {
        return house;
    }
}
