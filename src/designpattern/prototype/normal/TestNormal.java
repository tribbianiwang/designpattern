package designpattern.prototype.normal;

import designpattern.prototype.Sheep;

public class TestNormal {
    public static void main(String[] args) {
        Sheep sheepInit = new Sheep(1,"多利");
        Sheep sheep1 = new Sheep(sheepInit.getAge(),sheepInit.getName());
        Sheep sheep2 = new Sheep(sheepInit.getAge(),sheepInit.getName());
        Sheep sheep3 = new Sheep(sheepInit.getAge(),sheepInit.getName());
        Sheep sheep4 = new Sheep(sheepInit.getAge(),sheepInit.getName());
        Sheep sheep5 = new Sheep(sheepInit.getAge(),sheepInit.getName());

        System.out.println("sheepInit:"+sheepInit.toString());
        System.out.println("sheep1:"+sheep1.toString());
        System.out.println("sheep2:"+sheep2.toString());
        System.out.println("sheep3:"+sheep3.toString());
        System.out.println("sheep4:"+sheep4.toString());
        System.out.println("sheep5:"+sheep5.toString());

    }
}
