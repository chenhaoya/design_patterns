/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/30 15:53
 * 开发名称：TransmissionDoor
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice4.Context;

import Behavioral_Patterns.State_Pattern.Practice4.ConcreteState.Closed;
import Behavioral_Patterns.State_Pattern.Practice4.ConcreteState.Closing;
import Behavioral_Patterns.State_Pattern.Practice4.ConcreteState.Open;
import Behavioral_Patterns.State_Pattern.Practice4.State.TransmissionDoorState;

public class TransmissionDoor {
    private TransmissionDoorState TDState;

    private TransmissionDoorState closed,closing,open,opening,stayopen;

    public TransmissionDoor() {
        this.closed = new Closed();
        this.closing = new Closing(this.TDState);
        this.open = new Open();


        this.TDState =null;
    }

    public void setState(TransmissionDoorState state) {
        this.TDState = state;
    }

    public void onClick(){
        this.TDState.onClick();
    }

    public void complete() {
        this.TDState.complete();
    }

    public void timeout() {
        this.TDState.timeout();
    }
}