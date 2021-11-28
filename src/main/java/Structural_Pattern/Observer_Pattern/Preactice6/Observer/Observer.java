/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/28 15:01
 * 开发名称：Observer
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Observer_Pattern.Preactice6.Observer;

public interface Observer {
    String getName();
    void setShares(float f);
    void setPrice_1(float f);
    void setPrice_2(float f);

    float getPrice_1();
    float getPrice_2();
}