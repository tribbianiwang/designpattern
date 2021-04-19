package designpattern.builder.improve;

public class HighHouse extends HouseBuilder{

    public HighHouse() {
        getHouse().setBisics("50米");
        getHouse().setWalls("200米");
        getHouse().setRoofs("40层");
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
