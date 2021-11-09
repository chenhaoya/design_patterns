/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/9 15:24
 * 开发名称：RealUsers
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Proxy_Pattern.Practice6.RealSubject;

import Structural_Pattern.Proxy_Pattern.Practice6.Subject.BBS;

public class RealBBS implements BBS {
    @Override
    public void post() {
        System.out.println("你发帖l");
    }

    @Override
    public void edit_personal_infomation() {
        System.out.println("你修改了自己的注册信息");
    }

    @Override
    public void Edit_Post() {
        System.out.println("你修改了自己的帖子");
    }
}