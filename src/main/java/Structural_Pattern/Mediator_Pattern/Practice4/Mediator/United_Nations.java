/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 16:34
 * 开发名称：United_Nations
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Mediator_Pattern.Practice4.Mediator;

import Structural_Pattern.Mediator_Pattern.Practice4.Collegeue.Nation;

import java.util.Hashtable;

public abstract class United_Nations {
    protected String name_;
    protected Hashtable<String,Nation> country;

    public United_Nations(String name_) {
        this.name_ = name_;
        this.country = new Hashtable<>();
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public void addNation(Nation nation){
        if (this.country == null) {
            return;
        }
        this.country.put(nation.getName_(), nation);
    }

    public void delNation(String name_) {
        if (this.country == null) {
            return;
        }
        this.country.remove(name_);
    }

    public void delNation(Nation nation) {
        if (this.country == null) {
            return;
        }
        this.country.remove(nation.getName_());
    }

    public abstract void componentChanged(Nation nation);
}