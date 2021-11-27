/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 20:41
 * 开发名称：ConcreteAllyControlCenter
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Observer_Pattern.例题.ConcreteSubject;

import Structural_Pattern.Observer_Pattern.例题.Observer.Observer;
import Structural_Pattern.Observer_Pattern.例题.Subject.AllyControlCenter;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println("组建战队成功");
        System.out.println("---------------------------");
        this.allyName=allyName;
    }

    @Override
    public void notifyObservers(String name_) {
        System.out.println(this.getAllyName()+"战队通知，盟友"+name_+"遭受敌人攻击！");
        for (Observer observer : this.players) {
            if (!observer.getName().equalsIgnoreCase(name_)){
                observer.help_();
            }
        }
    }
}