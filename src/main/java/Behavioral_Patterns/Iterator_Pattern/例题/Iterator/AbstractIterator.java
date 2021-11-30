/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 14:49
 * 开发名称：AbstractIterator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Iterator_Pattern.例题.Iterator;

public interface AbstractIterator {
    void next();            //移至下一个元素
    boolean isLast();       //判断是否为最后一个元素
    void previous();        //移至上一个元素
    boolean isFirst();      //判断是否为第一个元素
    Object getNextItem();   //获取下一个元素
    Object getPreviousItem();//获取上一个元素
}