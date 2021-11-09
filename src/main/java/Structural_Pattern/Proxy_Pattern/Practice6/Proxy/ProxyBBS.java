/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/9 15:21
 * 开发名称：Proxy
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Proxy_Pattern.Practice6.Proxy;

import Structural_Pattern.Proxy_Pattern.Practice6.RealSubject.RealBBS;
import Structural_Pattern.Proxy_Pattern.Practice6.Subject.BBS;

public class ProxyBBS implements BBS {
    private RealBBS realBBS = null;
    private int authority = 2;
    private String name_;

    public ProxyBBS(String name, int authority) {
        this.name_ = name;
        this.authority = authority;
        if (authority == 1) {
            this.realBBS = new RealBBS();
        } else {
            System.out.println("你是一个游客只能浏览帖子");
        }
    }


    @Override
    public void post() {
        if (this.authority == 1) {
            this.realBBS.post();
        }
    }

    @Override
    public void edit_personal_infomation() {
        if (this.authority == 1) {
            this.realBBS.edit_personal_infomation();
        }
    }

    @Override
    public void Edit_Post() {
        if (this.authority == 1) {
            this.realBBS.Edit_Post();
        }
    }
}