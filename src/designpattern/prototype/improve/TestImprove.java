package designpattern.prototype.improve;

public class TestImprove {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(12,"多利","内蒙古");
        Sheep friend = new Sheep(13,"喜洋洋","动画");
        sheep.setFrind(friend);
        Sheep sheepCopy1 = (Sheep) sheep.clone();
        Sheep sheepCopy2 = (Sheep) sheep.clone();
        Sheep sheepCopy3 = (Sheep) sheep.clone();
        Sheep sheepCopy4 = (Sheep) sheep.clone();

        System.out.println("sc1"+sheepCopy1+"friend:"+sheepCopy1.getFrind());
        System.out.println("sc2"+sheepCopy1);
        System.out.println("sc3"+sheepCopy1);
        System.out.println("sc4"+sheepCopy1);
    }
}
