package designpattern.builder.normal;

public class TestBuildHouse {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        HighHouse highHouse = new HighHouse();
        highHouse.build();
    }
}
