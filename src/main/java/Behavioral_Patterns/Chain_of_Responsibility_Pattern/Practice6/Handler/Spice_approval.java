/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 13:47
 * 开发名称：Spice_approval
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice6.Handler;

import Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice6.Splendid;

public abstract class Spice_approval {
    protected Spice_approval spice_approval;
    protected String position;

    public Spice_approval(String position) {
        this.position = position;
    }

    public void setSpice_approval(Spice_approval spice_approval) {
        this.spice_approval = spice_approval;
    }

    public abstract void processResponse(Splendid splendid);
}