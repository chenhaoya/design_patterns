/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 16:47
 * 开发名称：America
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Mediator_Pattern.Practice4.ConcreteColleague;

import Structural_Pattern.Mediator_Pattern.Practice4.Collegeue.Nation;

public class America extends Nation {
    public America(String name_) {
        super(name_);
    }

    @Override
    public String getName_() {
        return super.getName_();
    }

    @Override
    public void setName_(String name_) {
        super.setName_(name_);
    }

    @Override
    public void illustrate(String msg_) {
        System.out.println(msg_+"成员："+this.name_);
    }
}