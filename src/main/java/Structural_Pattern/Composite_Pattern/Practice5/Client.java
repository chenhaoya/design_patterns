/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/19 15:28
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Composite_Pattern.Practice5;


import Structural_Pattern.Composite_Pattern.Practice5.Composite.Educational_institution;
import Structural_Pattern.Composite_Pattern.Practice5.Leaf.Office;

public class Client {
    public static void main(String[] args) {
        Educational_institution beijing = new Educational_institution("北京总部");
        Educational_institution hunan = new Educational_institution("湖南分校");
        Educational_institution xiangtan = new Educational_institution("湘潭教学点");
        Educational_institution changsha = new Educational_institution("长沙教学点");

        beijing.addList(new Office("教务办公室"));
        beijing.addList(hunan);
        beijing.addList(new Office("行政办公室"));



        changsha.addList(new Office("教务办公室"));
        hunan.addList(changsha);
        hunan.addList(xiangtan);
        changsha.addList(new Office("行政办公室"));


        xiangtan.addList(new Office("教务办公室"));
        xiangtan.addList(new Office("行政办公室"));


        hunan.addList(new Office("教务办公室"));
        hunan.addList(new Office("行政办公室"));

        xiangtan.official_document("aaa.txt");

    }
}