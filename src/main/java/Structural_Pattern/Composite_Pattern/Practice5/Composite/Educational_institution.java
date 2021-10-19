/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/19 15:19
 * 开发名称：Educational_institution
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Composite_Pattern.Practice5.Composite;

import Structural_Pattern.Composite_Pattern.Practice5.Component.Abstract_Office;
import Structural_Pattern.Composite_Pattern.Practice5.Leaf.Office;

import java.util.ArrayList;

public class Educational_institution extends Abstract_Office {
    private ArrayList<Abstract_Office> list = new ArrayList<Abstract_Office>();

    public Educational_institution(String s) {
        this.name = s;
    }

    public void addList(Abstract_Office abstract_office) {
        list.add(abstract_office);
    }

    public void remove(Abstract_Office abstract_office) {
        list.remove(abstract_office);
    }

    public Abstract_Office getList(int index) {
        return (Abstract_Office) list.get(index);
    }

    @Override
    public void official_document(String a) {
        System.out.println(this.name + "下发了公文");
        for (Object object : list) {
            System.out.print("--");
            System.out.println(getClass().getSimpleName());
            ((Abstract_Office)object).official_document(a);
        }
    }
}