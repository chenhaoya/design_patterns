/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 17:07
 * 开发名称：Student
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Iterator_Pattern.Practice5;

public class Student implements Comparable<Student> {
    private String name_;
    private int age_;

    public Student(String name_, int age_) {
        this.name_ = name_;
        this.age_ = age_;
    }

    public int getAge_() {
        return age_;
    }

    public void setAge_(int age_) {
        this.age_ = age_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age_ > o.age_) {
            return -1;
        } else if (this.age_ < o.age_) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name_='" + name_ + '\'' +
                ", age_=" + age_ +
                '}';
    }
}