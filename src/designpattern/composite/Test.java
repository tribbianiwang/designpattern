package designpattern.composite;

public class Test {
    public static void main(String[] args) {
        OrganizationComponent university = new University("黄淮学院","驻马店皇家学院");

        OrganizationComponent mathCollege = new College("数学与统计学院","数学专业");

        OrganizationComponent englishCollege = new College("外国语学院","各种外国语言");

        OrganizationComponent teachDepartement = new Department("教学部","教学部门");

        OrganizationComponent securityDepartement = new Department("安保部","安全保障部门");

        mathCollege.add(teachDepartement);
        mathCollege.add(securityDepartement);

        englishCollege.add(teachDepartement);
        englishCollege.add(securityDepartement);


        university.add(mathCollege);
        university.add(englishCollege);


        university.print();





    }
}
