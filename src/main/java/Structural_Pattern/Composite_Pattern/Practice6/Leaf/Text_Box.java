/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/18 16:03
 * 开发名称：Text_Box
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Composite_Pattern.Practice6.Leaf;

import Structural_Pattern.Composite_Pattern.Practice6.Component.Element_control;

public class Text_Box extends Element_control {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void operation() {

    }
}