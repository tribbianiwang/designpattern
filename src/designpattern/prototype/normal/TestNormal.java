package designpattern.prototype.normal;

public class TestNormal {
    public static void main(String[] args) {
        Sheep sheepInit = new Sheep(1,"多利","white");
        Sheep sheep1 = new Sheep(sheepInit.getAge(),sheepInit.getName(),sheepInit.getColor());
        Sheep sheep2 = new Sheep(sheepInit.getAge(),sheepInit.getName(),sheepInit.getColor());
        Sheep sheep3 = new Sheep(sheepInit.getAge(),sheepInit.getName(),sheepInit.getColor());
        Sheep sheep4 = new Sheep(sheepInit.getAge(),sheepInit.getName(),sheepInit.getColor());
        Sheep sheep5 = new Sheep(sheepInit.getAge(),sheepInit.getName(),sheepInit.getColor());

        System.out.println("sheepInit:"+sheepInit.toString());
        System.out.println("sheep1:"+sheep1.toString());
        System.out.println("sheep2:"+sheep2.toString());
        System.out.println("sheep3:"+sheep3.toString());
        System.out.println("sheep4:"+sheep4.toString());
        System.out.println("sheep5:"+sheep5.toString());

    }
}
