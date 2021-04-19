package designpattern.bridge;

public class Test {
    public static void main(String[] args) {

        Phone folderXiaomiPhone = new FolderPhone(new Xiaomi());
        folderXiaomiPhone.open();
        folderXiaomiPhone.close();
        folderXiaomiPhone.call();

        Phone uprightVivoPhone = new UprightPhone(new Vivo());
        uprightVivoPhone.open();
        uprightVivoPhone.close();
        uprightVivoPhone.call();

    }
}
