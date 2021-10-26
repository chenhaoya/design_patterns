/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/26 15:05
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Facade_Pattern.Practice4;

import Structural_Pattern.Facade_Pattern.Practice4.Facade.Facade;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Facade facade;
        Class<?> aClass = Class.forName("Structural_Pattern.Facade_Pattern.Practice4.Facade.Facade");
        facade = (Facade) aClass.newInstance();
        facade.file_processing("aaa.xml");
        System.out.println("----------第二个文件----------");
        facade.file_processing("aaa.txt");
    }
}