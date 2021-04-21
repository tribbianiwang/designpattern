package designpattern.facade;

public class DVDPlayer {
    private DVDPlayer(){

    }
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD打开了");
    }

    public void off(){
        System.out.println("DVD关闭了");
    }

    public void play(){
        System.out.println("DVD开始播放");
    }

    public void pause(){
        System.out.println("DVD暂停了");
    }



}
