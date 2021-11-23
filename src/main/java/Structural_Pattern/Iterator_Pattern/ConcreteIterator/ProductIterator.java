/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 14:53
 * 开发名称：ProductIterator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.ConcreteIterator;

import Structural_Pattern.Iterator_Pattern.Concreteaggregate.ProductList;
import Structural_Pattern.Iterator_Pattern.Iterator.AbstractIterator;

import java.util.List;

public class ProductIterator implements AbstractIterator {
    private List<Object> products;
    //定义一个游标，用于记录正向遍历的位置
    private int cursor1;
    //定义一个游标，由于记录逆向遍历的位置
    private int cursor2;

    public ProductIterator(ProductList list) {
        this.products = list.getObject();   //获取集合对象
        cursor1 = 0;                        //设置正向遍历游标的初始值
        cursor2  = products.size()-1;       //设置逆向遍历的初始值
    }

    @Override
    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1  == products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}