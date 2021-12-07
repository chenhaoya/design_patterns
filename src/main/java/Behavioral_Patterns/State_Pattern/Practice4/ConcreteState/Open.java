/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/30 16:06
 * 开发名称：Open
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice4.ConcreteState;

import Behavioral_Patterns.State_Pattern.Practice4.State.TransmissionDoorState;

public class Open extends TransmissionDoorState {
    public Open(String name_) {
        this.name_=name_;
    }

    @Override
    public void onClick() {
        System.out.println("click事件;当前状态："+this.name_);
    }

    @Override
    public void complete() {

    }

    @Override
    public void timeout() {
        System.out.println("timeout事件;当前状态："+this.name_);
    }
}