/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/30 20:36
 * 开发名称：Hub
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Flyweight_Pattern.Practice4.ConcreteFlyweight;

import Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight.Network_equipment;
import Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight.Point;

public class Hub implements Network_equipment {
    String type_;
    String name_= "Hub";

    public Hub(String type_, String name_) {
        this.type_ = type_;
        this.name_ = name_;
    }




    @Override
    public String getType() {
        return this.type_;
    }

    @Override
    public void point(Point point) {
        System.out.println("设备类型:"+this.type_ +"\n设备端口:"+point.getPoint()+"\n设备名称:"+this.name_);
    }
}