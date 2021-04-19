package designpattern.adapter.classmode;

public class Phone {

    public void charging(Voltage5V volitage){
        if(volitage.output5V()==5){
            System.out.println("电压为5v开始充电");
        }else {
            System.out.println("电压不为5v");
        }

    }
}
