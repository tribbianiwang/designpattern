package designpattern.proxy.cglib;

public class Test {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        TeacherDao teacherDao = (TeacherDao) proxyFactory.getProxyInstance();
        teacherDao.teach();

    }
}
