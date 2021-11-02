/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/1 16:17
 * 开发名称：Yewu
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Proxy_Pattern.Practice5.RealSubject;


import Structural_Pattern.Proxy_Pattern.Practice5.Subject.Interface_Business;

public class Business1 implements Interface_Business {
    @Override
    public void method(String value1,String value2) {
        System.out.println("调用了："+getClass().getSimpleName());
    }
}