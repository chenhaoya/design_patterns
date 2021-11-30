/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 15:02
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Iterator_Pattern.例题;

import Behavioral_Patterns.Iterator_Pattern.例题.Aggregate.AbstractObjectList;
import Behavioral_Patterns.Iterator_Pattern.例题.Concreteaggregate.ProductList;
import Behavioral_Patterns.Iterator_Pattern.例题.Iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Object> products = new ArrayList<>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList list;
        AbstractIterator iterator;

        //创建聚合对象
        list = new ProductList(products);
        //创建迭代器对象
        iterator = list.createIterator();
        System.out.println("正向遍历");
        while (!iterator.isLast()){
            System.out.printf(iterator.getNextItem()+",");
            iterator.next();
        }

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("逆向遍历");
        while (!iterator.isFirst()) {
            System.out.printf(iterator.getPreviousItem()+",");
            iterator.previous();
        }
    }
}