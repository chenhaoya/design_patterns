/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/9 16:07
 * 开发名称：War_Request
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Chain_of_Responsibility_Pattern.Practice4;

public class War_Request {
    private int number_;
    private String war_name;

    public War_Request(int number_, String name_) {
        this.number_ = number_;
        this.war_name = name_;
    }

    public int getNumber_() {
        return number_;
    }

    public void setNumber_(int number_) {
        this.number_ = number_;
    }

    public String getWar_name() {
        return war_name;
    }

    public void setWar_name(String war_name) {
        this.war_name = war_name;
    }
}