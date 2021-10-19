/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/19 15:22
 * 开发名称：Office
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Composite_Pattern.Practice5.Leaf;

import Structural_Pattern.Composite_Pattern.Practice5.Component.Abstract_Office;

public class Office extends Abstract_Office {
    public Office(String s) {
        this.name = s;
    }

    @Override
    public void official_document(String a) {
        System.out.println(this.name+"接收了"+a+"文件");
    }
}