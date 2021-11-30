/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 14:44
 * 开发名称：AbstractObjectList
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Iterator_Pattern.例题.Aggregate;

import Behavioral_Patterns.Iterator_Pattern.例题.ConcreteIterator.ProductIterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
    protected List<Object> object = new ArrayList<>();

    public AbstractObjectList(List<Object> object) {
        this.object = object;
    }

    public void addObject(Object obj){
        this.object.add(obj);
    }

    public void removeObject(Object object){
        this.object.remove(object);
    }

    public List<Object> getObject(){
        return this.object;
    }

    public abstract ProductIterator createIterator();
}