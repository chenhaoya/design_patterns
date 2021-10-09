/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/9/28 22:23
 * 开发名称：Client.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：用于演示深克隆时奖引用的dataset对象一起复制，体现出与浅克隆的区别
 */
package Prototype_Pattern.Exercise4;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        DataChart a,b=null;
        a=new DataChart();
        DataSet ds=new DataSet();
        a.setDataSet(ds);
        // 以上代码用于初始化原型对象

        try {
            b = a.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(a==b);
        System.out.println(a.getClass());
        System.out.println(b.getClass());
    }
}
