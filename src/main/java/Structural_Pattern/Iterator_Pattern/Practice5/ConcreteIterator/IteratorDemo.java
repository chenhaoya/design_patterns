/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 17:36
 * 开发名称：IteratorDemo
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice5.ConcreteIterator;

import Structural_Pattern.Iterator_Pattern.Practice5.Student;

import java.util.*;

public class IteratorDemo {
    private List<Student> students = new ArrayList<>();

    public IteratorDemo() {
        this.students.add(new Student("aaa", 20));
        this.students.add(new Student("bbb", 59));
        this.students.add(new Student("ccc", 10));
        this.students.add(new Student("ddd", 20));
        this.students.add(new Student("eee", 60));
    }

    public void display() {
        Iterator<Student> iterator = this.students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next.getName_() + next.getAge_());
        }

        System.out.println("----------------");
        Collections.sort(students);
        Iterator<Student> iterator1 = this.students.iterator();
        while (iterator1.hasNext()) {
            Student next = iterator1.next();
            System.out.println(next.getName_() + next.getAge_());
        }

    }


}