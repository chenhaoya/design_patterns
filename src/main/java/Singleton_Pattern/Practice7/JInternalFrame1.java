/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/10 23:06
 * 开发名称：JInternalFrame1.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Singleton_Pattern.Practice7;

import javax.swing.JInternalFrame;

public class JInternalFrame1 extends JInternalFrame {

    private static JInternalFrame1 JIF1 = null;

    private JInternalFrame1(String name, boolean b1, boolean b2, boolean b3, boolean b4) {
        super(name, b1, b2, b3, b4);
    }

    public static JInternalFrame1 getJInternalFrame1(String name, boolean b1, boolean b2, boolean b3, boolean b4) {
        if (JIF1 == null) {
            JIF1 = new JInternalFrame1(name, b1, b2, b3, b4);
        }
        return JIF1;
    }
}