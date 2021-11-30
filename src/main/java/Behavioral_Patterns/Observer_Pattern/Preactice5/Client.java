/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 21:28
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Observer_Pattern.Preactice5;

import Behavioral_Patterns.Observer_Pattern.Preactice5.ConcreteObserver.Student;
import Behavioral_Patterns.Observer_Pattern.Preactice5.ConcreteObserver.Teacher;
import Behavioral_Patterns.Observer_Pattern.Preactice5.ConcreteSubject.Concrete_Tie;
import Behavioral_Patterns.Observer_Pattern.Preactice5.Subject.Abstract_Tie;

public class Client {
    public static void main(String[] args) {
        Abstract_Tie concrete_tie = new Concrete_Tie("信息工程学院");

        Teacher teacher1, teacher2;
        Student student1, student2;

        teacher1 = new Teacher("aaa", "老师");
        teacher2 = new Teacher("bbb", "老师");

        student1 = new Student("ccc", "学生");
        student2 = new Student("ddd", "学生");

        concrete_tie.attachObserver(teacher1);
        concrete_tie.attachObserver(teacher2);
        concrete_tie.attachObserver(student1);
        concrete_tie.attachObserver(student2);

        concrete_tie.notify_();
        concrete_tie.display_();

        concrete_tie.setName_("管理学院");
        concrete_tie.notify_();
        concrete_tie.display_();
    }
}