/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 15:12
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice4;

import Structural_Pattern.Iterator_Pattern.Practice4.Aggregate.Channel_aggregate;
import Structural_Pattern.Iterator_Pattern.Practice4.Concreteaggregate.Channel_List;
import Structural_Pattern.Iterator_Pattern.Practice4.Iterator.EmoteControl_Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add("频道一");
        objects.add("频道二");
        objects.add("频道三");
        objects.add("频道四");
        objects.add("频道五");
        objects.add("频道六");

        //创建聚合对象
        Channel_aggregate channel_aggregate;
        //创建迭代器对象
        EmoteControl_Iterator emoteControl_iterator;

        channel_aggregate = new Channel_List(objects);
        emoteControl_iterator = channel_aggregate.createIterator();

        //获取当前频道
        System.out.println(emoteControl_iterator.currentItem());
        //下一个频道
        emoteControl_iterator.next();
        emoteControl_iterator.next();
        emoteControl_iterator.next();
        emoteControl_iterator.next();
        emoteControl_iterator.next();

        //当前为最后一个频道，再往下跳一个频道就自动跳到第一个频道
        emoteControl_iterator.next();
    }
}