/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 15:51
 * 开发名称：Channel_List
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice4.Concreteaggregate;

import Structural_Pattern.Iterator_Pattern.Practice4.Aggregate.Channel_aggregate;
import Structural_Pattern.Iterator_Pattern.Practice4.ConcreteIterator.Conreete_Iterator;
import Structural_Pattern.Iterator_Pattern.Practice4.Iterator.EmoteControl_Iterator;

import java.util.List;

public class Channel_List extends Channel_aggregate {
    public Channel_List(List<Object> list) {
        super(list);
    }

    @Override
    public EmoteControl_Iterator createIterator() {
        return new Conreete_Iterator(this);
    }
}