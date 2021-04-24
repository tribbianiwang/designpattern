package designpattern.proxy.statics;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("开始教学。。");
    }
}
