/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 15:36
 * 开发名称：Channel_aggregate
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice4.Aggregate;

import Structural_Pattern.Iterator_Pattern.Practice4.Iterator.EmoteControl_Iterator;
import Structural_Pattern.Iterator_Pattern.例题.Iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

public abstract class Channel_aggregate {
    protected List<Object> list = new ArrayList<>();

    public Channel_aggregate(List<Object> list) {
        this.list = list;
    }

    public void addObject(Object object){
        this.list.add(object);
    }

    public void removeObject(Object object) {
        this.list.remove(object);
    }

    public List<Object> getObject() {
        return this.list;
    }

    public abstract EmoteControl_Iterator createIterator();
}