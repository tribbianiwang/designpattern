package designpattern.proxy.dynamic;

public class Test {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
         ITeacherDao proxyInstance= (ITeacherDao) new ProxyFactory(target).getInstance();
         proxyInstance.teach();
         proxyInstance.speach();
    }
}
