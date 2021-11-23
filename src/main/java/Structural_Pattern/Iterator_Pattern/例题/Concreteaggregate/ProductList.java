/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 14:48
 * 开发名称：ProductList
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.例题.Concreteaggregate;

import Structural_Pattern.Iterator_Pattern.例题.Aggregate.AbstractObjectList;
import Structural_Pattern.Iterator_Pattern.例题.ConcreteIterator.ProductIterator;

import java.util.List;

public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> object) {
        super(object);
    }

    @Override
    public ProductIterator createIterator() {
        return new ProductIterator(this);
    }
}