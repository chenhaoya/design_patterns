/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 15:39
 * 开发名称：ConcreteStock
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Observer_Pattern.Preactice6.ConcreteSubject;

import Behavioral_Patterns.Observer_Pattern.Preactice6.Observer.Observer;
import Behavioral_Patterns.Observer_Pattern.Preactice6.Subject.Stock;

public class ConcreteStock extends Stock {

    /**构造：股票名、股票当前价格*/
    public ConcreteStock(String name_, float priceNow) {
        super(name_, priceNow);
        System.out.println("----------------------------");
        System.out.println(this.name_+"股票已开盘");
        System.out.println("----------------------------");
    }

    @Override
    public void notify_() {
        for (Observer observer :
                this.arrayList) {
            if (this.priceNow>observer.getPrice_1()*1.05 || this.priceNow + observer.getPrice_1() * 0.05 < observer.getPrice_1()) {
                System.out.println("韭菜！："+observer.getName()+"你买的"+this.name_+"股票幅度超过5%啦");
            }
        }

    }
}