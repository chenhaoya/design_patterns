package Structural_Pattern.Flyweight_Pattern.Practice4.ConcreteFlyweight;

import Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight.Network_equipment;
import Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight.Point;

public class Switch implements Network_equipment {
    String type_;
    String name_="Switch";

    public Switch(String type_, String name_) {
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
