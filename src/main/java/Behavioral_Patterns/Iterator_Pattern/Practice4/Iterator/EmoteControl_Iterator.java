/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/23 15:40
 * 开发名称：EmoteControl_Iterator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Iterator_Pattern.Practice4.Iterator;

public interface EmoteControl_Iterator {
    //移至第一个频道
    void first();
    //移至下一个频道
    void next();
    //判断是否还有下一个元素
    boolean hasNext();
    //
    Object currentItem();
}