/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/31 11:01
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Flyweight_Pattern.Practice5;

import Structural_Pattern.Flyweight_Pattern.Practice5.Flyweight.FILE;
import Structural_Pattern.Flyweight_Pattern.Practice5.FlyweightFactory.FlyweightFactory;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        FlyweightFactory factory;

        Class<?> aClass = Class.forName("Structural_Pattern.Flyweight_Pattern.Practice5.FlyweightFactory.FlyweightFactory");

        factory = (FlyweightFactory) aClass.newInstance();

        FILE video1 = factory.getFlyweight_("Video");

        FILE video = factory.getFlyweight_("Video");



        System.out.println(video1.hashCode());
        System.out.println(video.hashCode());

    }
}