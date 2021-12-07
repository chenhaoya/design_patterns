/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/30 15:53
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.State_Pattern.Practice4;

import Behavioral_Patterns.State_Pattern.Practice4.Context.TransmissionDoor;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<TransmissionDoor> transmissionDoorClass = TransmissionDoor.class;
        TransmissionDoor transmissionDoor = transmissionDoorClass.newInstance();

        transmissionDoor.onClick();
        transmissionDoor.onClick();
        transmissionDoor.onClick();
        transmissionDoor.complete();
        transmissionDoor.onClick();
        transmissionDoor.onClick();
        transmissionDoor.onClick();
        transmissionDoor.complete();
        transmissionDoor.timeout();
        transmissionDoor.complete();
    }
}