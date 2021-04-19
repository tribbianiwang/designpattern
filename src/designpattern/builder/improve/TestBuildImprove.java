package designpattern.builder.improve;

public class TestBuildImprove {
    public static void main(String[] args) {

//        CommonHouse commonHouse = new CommonHouse();
        HighHouse highHouse = new HighHouse();
        HouseDirector houseDirector = new HouseDirector(highHouse);
        houseDirector.constructHouse();



    }
}
