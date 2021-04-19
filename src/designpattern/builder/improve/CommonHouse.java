package designpattern.builder.improve;

public class CommonHouse extends HouseBuilder{

    public CommonHouse() {
        getHouse().setBisics("5米");
        getHouse().setWalls("10米");
        getHouse().setRoofs("2层");
    }

    @Override
    public void buildBasics() {
        System.out.println("建一个普通房子地基深"+getHouse().getBisics());
    }

    @Override
    public void buildWalls() {
        System.out.println("建一个普通房子墙面高度:"+getHouse().getWalls());
    }

    @Override
    public void roofed() {
        System.out.println("建一个普通房子楼层:"+getHouse().getRoofs());

    }
}
