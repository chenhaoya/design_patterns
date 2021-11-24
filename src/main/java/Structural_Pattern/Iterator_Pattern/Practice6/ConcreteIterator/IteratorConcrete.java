/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 17:29
 * 开发名称：IteratorConcrete
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice6.ConcreteIterator;

import Structural_Pattern.Iterator_Pattern.Practice6.ConcreteAggregate.ProductConcrete;
import Structural_Pattern.Iterator_Pattern.Practice6.Iterator.Iterator;

import java.util.ArrayList;

public class IteratorConcrete implements Iterator {
    private ArrayList list;
    private ProductConcrete pc;
    private int count;

    public IteratorConcrete(ProductConcrete pc) {
        this.pc = pc;
        this.list = pc.getList();
        this.count = -1;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            this.count++;
            return list.get(this.count);
        }
        return null;
    }

    @Override
    public Object currentItem() {
        return list.get(count);
    }

    @Override
    public boolean hasNext() {
        return (this.count < list.size() - 1);
    }

    @Override
    public Object[] pagination_(int counter) {
        /**counter是客户端传来的分页元素个数*/
        ArrayList<Object> obj = new ArrayList();
        int index = 0;
        while (this.hasNext() && index < counter) {
            Object object = next();
            obj.add(object);
            System.out.println(object);
            index++;
        }
        return obj.toArray();
    }

    @Override
    public void pagination(int counter) {
/**只要还有元素，继续分页*/
        while (this.hasNext()) {
//            Object[] objects = pagination_(counter);
//            for (Object object :
//                    objects) {
//                System.out.println(object.toString());
//            }
            pagination_(counter);
            System.out.println("------------分页线------------");
        }
    }
}