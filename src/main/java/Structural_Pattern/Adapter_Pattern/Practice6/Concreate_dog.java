/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/11 16:02
 * 开发名称：Concreate_dog.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Adapter_Pattern.Practice6;

public class Concreate_dog implements Dog{
    public void dog_looks() {
        System.out.println("我是狗");
    }

    public void cry() {
        System.out.println("狗叫");
    }
}
