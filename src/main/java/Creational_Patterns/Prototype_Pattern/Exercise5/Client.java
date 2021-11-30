/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/9 23:02
 * 开发名称：Client.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：原型管理器使用hashtable存放原型模板
 */
package Creational_Patterns.Prototype_Pattern.Exercise5;

public class Client {
    public static void main(String[] args) {
        Document_Manger document_manger = new Document_Manger();
        Document1 a = document_manger.getDocumentTable("a");
        System.out.println(a.getClass());
    }
}
