/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/16 14:51
 * 开发名称：MenuItem
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：菜单
 */
package Structural_Pattern.Command_Pattern.Practice6.Invoker;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Menultem> menultems = new ArrayList<>();

//    添加菜单项
    public void addMenuItem(Menultem menultem) {
        menultems.add(menultem);
    }


//返回菜单项
    public Menultem getMenuItem(String name_) {
        for (Menultem a :
                menultems) {
            if (a.getName_().equals(name_)){
                return a;
            }
        }
        return null;
    }
}