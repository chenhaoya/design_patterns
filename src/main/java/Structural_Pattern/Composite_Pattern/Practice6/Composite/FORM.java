/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/18 16:02
 * 开发名称：FORM
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Composite_Pattern.Practice6.Composite;

import Structural_Pattern.Composite_Pattern.Practice6.Component.Element_control;

import java.util.ArrayList;

public class FORM extends Element_control {
    private String name_;

    private ArrayList<Element_control> list = new ArrayList<Element_control>();

    @Override
    public void operation() {
        for (Object obj : list) {
            ((Element_control) obj).operation();
        }
    }

    boolean addElement(Element_control element_control) {
        return list.add(element_control);
    }

    boolean removeElement(Element_control element_control) {
        return list.remove(element_control);
    }

    Element_control getElement(int i) {
        return (Element_control) list.get(i);
    }


}