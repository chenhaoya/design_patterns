/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 17:24
 * 开发名称：Product
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice6.Aggregate;

import Structural_Pattern.Iterator_Pattern.Practice6.Iterator.Iterator;

import java.util.ArrayList;

public abstract class Product {
    protected ArrayList list;

    public Product(ArrayList list) {
        this.list = list;
    }

    public ArrayList getList() {
        return list;
    }

    public abstract Iterator createIterator();
}