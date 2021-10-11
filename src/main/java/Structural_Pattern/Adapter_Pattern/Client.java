/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/11 16:15
 * 开发名称：Client.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Adapter_Pattern;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Adapter(new Concreate_dog());
        cat.catchMouse();
        cat.cat_loogs();

        Dog dog = new Adapter(new Concreate_cat());
        dog.cry();
        dog.dog_looks();
    }
}
