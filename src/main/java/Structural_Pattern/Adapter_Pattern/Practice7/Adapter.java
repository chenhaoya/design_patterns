/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/11 23:17
 * 开发名称：Adapter.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Structural_Pattern.Adapter_Pattern.Practice7;

public class Adapter implements RealPlayer,Windows_Media_Player{
    private ConcreateRP concreateRP;
    private ConcreateWMP concreateWMP;

    public Adapter(ConcreateWMP concreateWMP) {
        this.concreateWMP = concreateWMP;
    }

    public Adapter(ConcreateRP concreateRP) {
        this.concreateRP = concreateRP;
    }

    public void RPplay() {
        concreateRP.RPplay();
    }

    public void WMPplay() {
        concreateWMP.WMPplay();
    }
}
