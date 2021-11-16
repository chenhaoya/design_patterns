/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/16 15:20
 * 开发名称：Menultem
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：菜单项
 */
package Structural_Pattern.Command_Pattern.Practice6.Invoker;

import Structural_Pattern.Command_Pattern.Practice6.Command.MenuAbstract;

public class Menultem {
    private String name_;
    private MenuAbstract menuAbstract;

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public Menultem(String name_, MenuAbstract menuAbstract) {
        this.name_ = name_;
        this.menuAbstract = menuAbstract;
    }

    public void clicked(){
        System.out.println("Gj19MenuItem中的"+this.name_+"被执行");
        menuAbstract.execute();
    }
}