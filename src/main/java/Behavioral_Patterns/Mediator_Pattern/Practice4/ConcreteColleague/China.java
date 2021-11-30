/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 16:48
 * 开发名称：China
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteColleague;

import Behavioral_Patterns.Mediator_Pattern.Practice4.Collegeue.Nation;

public class China extends Nation {
    public China(String name_) {
        super(name_);
    }

    @Override
    public String getName_() {
        return this.name_;
    }

    @Override
    public void setName_(String name_) {
        this.name_=name_;
    }

    @Override
    public void illustrate(String msg_) {
        System.out.println(msg_+"成员："+this.name_);
    }
}