/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/30 20:48
 * 开发名称：Factory
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Flyweight_Pattern.Practice4.FlyweightFactory;

import Structural_Pattern.Flyweight_Pattern.Practice4.ConcreteFlyweight.Hub;
import Structural_Pattern.Flyweight_Pattern.Practice4.ConcreteFlyweight.Switch;
import Structural_Pattern.Flyweight_Pattern.Practice4.Flyweight.Network_equipment;

import java.util.ArrayList;

public class Factory {
    private ArrayList<Network_equipment> flyweightList = new ArrayList<Network_equipment>();

    public Network_equipment getFlyweightList(String type,String name) {
        int z=0;
        for (Network_equipment i : flyweightList) {
            if (type.equalsIgnoreCase(i.getType())){
                z++;
                return i;
            }
        }
        if (z==0){
            if (type.equalsIgnoreCase("Hub")){
                flyweightList.add(new Hub(type,name));
            }else   {
                flyweightList.add(new Switch(type,name));
            }
        }
        return flyweightList.get(flyweightList.size()-1);
    }
}