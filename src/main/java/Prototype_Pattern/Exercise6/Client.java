/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/10 16:24
 * 开发名称：Client.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Prototype_Pattern.Exercise6;

import java.io.IOException;

/**
 * @author Chenhao
 */
public class Client{
    public static void main(String[] args) {
        Customer customer = new Customer();

        Customer clone1 = null,deepClone1=null;


        try {
            clone1 = customer.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            deepClone1 = customer.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Address address0 = customer.getAddress();

        Address address1 = clone1.getAddress();

        Address address2 = deepClone1.getAddress();

        //验证
        System.out.println(address0.hashCode());
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}
