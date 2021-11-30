/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 20:06
 * 开发名称：Mediator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.例题.Mediator;

import Behavioral_Patterns.Mediator_Pattern.例题.Colleague.Component;

public abstract class Mediator {
    public abstract void componentChanged(Component c);
}