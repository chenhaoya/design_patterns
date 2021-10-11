/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/10 23:04
 * 开发名称：JInternalFrameDemo.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Singleton_Pattern.Practice7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;


public class JInternalFrameDemo extends JFrame implements ActionListener {

    private static JInternalFrame1 internalFrame;
    Container contentPane = this.getContentPane();

    public JInternalFrameDemo() {
        super("主窗体");
        contentPane.setLayout(new BorderLayout());
        JButton button = new JButton("创建一个子窗体");
        button.addActionListener(this);
        contentPane.add(button, BorderLayout.SOUTH);
        this.setSize(new Dimension(300, 300));
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        internalFrame = JInternalFrame1.getJInternalFrame1("子窗体", true, true, true, true);
        internalFrame.setSize(new Dimension(200, 200));
        internalFrame.setVisible(true);
        JDesktopPane desktopPane = new JDesktopPane();
        contentPane.add(desktopPane);
        desktopPane.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            System.out.println("Exception while selecting");
        }
    }
}