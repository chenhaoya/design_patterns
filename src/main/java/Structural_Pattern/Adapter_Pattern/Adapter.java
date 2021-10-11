/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/11 16:08
 * 开发名称：Adapter.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Adapter_Pattern;

public class Adapter implements Cat,Dog{
    private Cat cat;
    private Dog dog;

    public Adapter(Dog dog) {
        this.dog = dog;
    }

    public Adapter(Cat cat) {
        this.cat = cat;
    }

    public void cat_loogs() {
        System.out.println("我是一只猫");
    }

    public void dog_looks() {
        System.out.println("我是一条狗");
    }

    public void cry() {
        cat.catchMouse();
    }

    public void catchMouse() {
        dog.cry();
    }
}
