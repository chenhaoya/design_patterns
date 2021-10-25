/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/25 8:42
 * 开发名称：B_Phone
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Decorator_Pattern.Practice4.ConcreteComponent;

import Structural_Pattern.Decorator_Pattern.Practice4.Component.Component;

public class B_Phone implements Component {
    @Override
    public void display() {
        System.out.println(getClass().getSimpleName());
    }
}