/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/12 16:18
 * 开发名称：Client.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Adapter_Pattern.Practice8;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        DataOperation dataOperation;
        Class<?> aClass = Class.forName("Structural_Pattern.Adapter_Pattern.Practice8.Adapter");
        dataOperation = (DataOperation) aClass.newInstance();
        dataOperation.search();
        dataOperation.sort();
    }
}
