/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/30 15:53
 * 开发名称：TransmissionDoorState
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice4.State;

import Behavioral_Patterns.State_Pattern.Practice4.Context.TransmissionDoor;

public abstract class TransmissionDoorState {
    protected String name_;

    protected TransmissionDoor transmissionDoor;

    public TransmissionDoor getTransmissionDoor() {
        return transmissionDoor;
    }

    public String getName_() {
        return name_;
    }

    public abstract void onClick();
    public abstract void complete();
    public abstract void timeout();

}