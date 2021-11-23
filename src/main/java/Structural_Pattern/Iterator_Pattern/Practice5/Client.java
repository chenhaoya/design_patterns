/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 16:40
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice5;

import Structural_Pattern.Iterator_Pattern.Practice5.ConcreteIterator.IteratorDemo;

public class Client {
    public static void main(String[] args) {
        IteratorDemo iteratorDemo = new IteratorDemo();
        iteratorDemo.display();
    }
}