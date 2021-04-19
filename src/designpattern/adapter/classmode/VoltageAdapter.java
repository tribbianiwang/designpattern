package designpattern.adapter.classmode;

public class VoltageAdapter  implements Voltage5V{

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        return voltage220V.outPut220v()/44;
    }

}
