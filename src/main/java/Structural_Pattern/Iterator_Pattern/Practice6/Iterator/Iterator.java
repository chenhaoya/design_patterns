/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/24 17:24
 * 开发名称：Iterator
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Iterator_Pattern.Practice6.Iterator;

public interface Iterator {
    Object next();
    boolean hasNext();
    Object[] pagination_(int counter);
    void pagination(int counter);
    Object currentItem();
}