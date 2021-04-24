package designpattern.proxy.statics;

public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("教学前的准备活动...");
        iTeacherDao.teach();
        System.out.println("教学完成后的收尾...");
    }
}
