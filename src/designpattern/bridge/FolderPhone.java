package designpattern.bridge;

public class FolderPhone extends Phone{
    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("折叠手机");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("折叠手机");
        super.close();
    }

    @Override
    public void call() {
        System.out.println("折叠手机");
        super.call();
    }
}
