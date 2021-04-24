package designpattern.proxy.dynamic;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("开始教学活动");
    }

    @Override
    public void speach() {
        System.out.println("开始说");
    }
}
