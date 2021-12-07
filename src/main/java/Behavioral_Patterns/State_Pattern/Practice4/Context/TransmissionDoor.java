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

import Behavioral_Patterns.State_Pattern.Practice4.ConcreteState.*;
import Behavioral_Patterns.State_Pattern.Practice4.State.TransmissionDoorState;

public class TransmissionDoor {
    private TransmissionDoorState TDState;


    public TransmissionDoor() {
        this.TDState =new Closed("已关闭");
    }

    public void setState(TransmissionDoorState state) {
        this.TDState = state;
    }

    public void onClick(){
        if (this.TDState.getName_().equalsIgnoreCase("已关闭")||this.TDState.getName_().equalsIgnoreCase("正在关闭")) {
            this.TDState=new Opening("正在打开");
        } else if (this.TDState.getName_().equalsIgnoreCase("正在打开")||this.TDState.getName_().equalsIgnoreCase("保持打开")) {
            this.TDState = new Closing("正在关闭");
        } else if (this.TDState.getName_().equalsIgnoreCase("打开")) {
            this.TDState = new StayOpen("保持打开");
        } else {
            System.out.println("操作错误");
        }
        this.TDState.onClick();
    }


    public void complete() {
        if (this.TDState.getName_().equalsIgnoreCase("正在打开")) {
            this.TDState = new Open("打开");
        } else if (this.TDState.getName_().equalsIgnoreCase("正在关闭")) {
            this.TDState = new Closed("已关闭");
        } else {
            System.out.println("操作错误");
        }
        this.TDState.complete();
    }

    public void timeout() {
        if (this.TDState.getName_().equalsIgnoreCase("打开")) {
            this.TDState = new Closing("正在关闭 ");
        } else {
            System.out.println("操作错误");
        }
        this.TDState.timeout();
    }
}