/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 20:30
 * 开发名称：AllyControlCenter
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Observer_Pattern.例题.Subject;

import Structural_Pattern.Observer_Pattern.例题.Observer.Observer;

import java.util.ArrayList;

/**
 * @author CH
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected ArrayList<Observer> players=new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
    /**注册方法*/
    public void join(Observer observer) {
        System.out.println(observer.getName()+"加入"+this.allyName+"战队");
        players.add(observer);
    }
    /**销毁方法*/
    public void quit(Observer observer) {
        System.out.println(observer.getName()+"退出"+this.allyName+"战队");
        players.remove(observer);
    }
    /**抽象方法*/
    public abstract void notifyObservers(String name_);
}