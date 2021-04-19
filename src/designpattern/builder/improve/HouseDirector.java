package designpattern.builder.improve;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){

        houseBuilder.buildBasics();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return  houseBuilder.build();
    }




}
