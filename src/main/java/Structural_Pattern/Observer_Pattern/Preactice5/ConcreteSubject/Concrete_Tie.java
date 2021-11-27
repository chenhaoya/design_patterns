/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 21:32
 * 开发名称：Concrete_Tie
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Observer_Pattern.Preactice5.ConcreteSubject;

import Structural_Pattern.Observer_Pattern.Preactice5.Observer.Observer;
import Structural_Pattern.Observer_Pattern.Preactice5.Subject.Abstract_Tie;

public class Concrete_Tie extends Abstract_Tie {
    public Concrete_Tie(String name_) {
        this.tieName_=name_;
    }

    @Override
    public void notify_() {
        for (Observer observer :
                this.observerArrayList) {
            observer.update(this.tieName_);
        }
    }

    @Override
    public void display_(){
        for (Observer observer :
                this.observerArrayList) {
            System.out.println("职位："+observer.getPosition()+"院系："+observer.getTieName_()+"姓名："+observer.getName_());
        }
    }
}