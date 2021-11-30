/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 17:24
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Iterator_Pattern.Practice6;

import Behavioral_Patterns.Iterator_Pattern.Practice6.Aggregate.Product;
import Behavioral_Patterns.Iterator_Pattern.Practice6.ConcreteAggregate.ProductConcrete;
import Behavioral_Patterns.Iterator_Pattern.Practice6.Iterator.Iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("111");
        objects.add("222");
        objects.add("333");
        objects.add("444");
/*        objects.add("555");
        objects.add("666");
        objects.add("777");
        objects.add("888");
        objects.add("999");*/

        Product product;
        Iterator iterator;
        product = new ProductConcrete(objects);
        iterator = product.createIterator();
        iterator.pagination(3);
    }
}