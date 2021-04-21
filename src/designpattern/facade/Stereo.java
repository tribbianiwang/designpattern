package designpattern.facade;

public class Stereo {
    private Stereo(){
    }

    private static Stereo instance =new Stereo();

    public static Stereo getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("打开音响");
    }

    public void off(){
        System.out.println("关闭音响");
    }

    public void voiceUp(){
        System.out.println("音响加大音量");
    }

    public void voiceDown(){
        System.out.println("音响减小音量");
    }

    public void play(){
        System.out.println("音响开始播放声音");
    }

    public void stop(){
        System.out.println("音响停止播放");
    }

    public void pause(){
        System.out.println("音响暂停播放");
    }
}
