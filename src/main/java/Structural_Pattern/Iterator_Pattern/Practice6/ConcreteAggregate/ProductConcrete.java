/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 17:28
 * 开发名称：ProductConcrete
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice6.ConcreteAggregate;

import Structural_Pattern.Iterator_Pattern.Practice6.Aggregate.Product;
import Structural_Pattern.Iterator_Pattern.Practice6.ConcreteIterator.IteratorConcrete;
import Structural_Pattern.Iterator_Pattern.Practice6.Iterator.Iterator;

import java.util.ArrayList;

public class ProductConcrete extends Product {
    public ProductConcrete(ArrayList list) {
        super(list);
    }

    @Override
    public Iterator createIterator() {
        return new IteratorConcrete(this);
    }
}