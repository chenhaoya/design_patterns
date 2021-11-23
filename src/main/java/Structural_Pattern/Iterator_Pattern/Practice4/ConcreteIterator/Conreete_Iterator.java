/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 15:53
 * 开发名称：Conreete_Iterator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice4.ConcreteIterator;

import Structural_Pattern.Iterator_Pattern.Practice4.Aggregate.Channel_aggregate;
import Structural_Pattern.Iterator_Pattern.Practice4.Concreteaggregate.Channel_List;
import Structural_Pattern.Iterator_Pattern.Practice4.Iterator.EmoteControl_Iterator;

import java.util.List;

public class Conreete_Iterator implements EmoteControl_Iterator {
    private List<Object> channel;
    private int cursor;
    private int cursor_z;

    public Conreete_Iterator(Channel_aggregate object) {
        this.channel = object.getObject();
        cursor=0;
        cursor_z=this.channel.size()-1;
    }

    @Override
    public void first() {
        this.cursor=0;
    }

    @Override
    public void next() {
        if (this.hasNext()) {
            this.cursor++;
            System.out.println(this.currentItem());
        }else {
            this.cursor=0;
        }
    }

    @Override
    public boolean hasNext() {
        if (this.cursor+1 < this.channel.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return channel.get(this.cursor);
    }
}