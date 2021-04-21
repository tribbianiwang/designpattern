package designpattern.facade;

public class Screen {
    private Screen(){

    }

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("升起幕布");
    }

    public void down(){
        System.out.println("落下幕布");
    }

}
