/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/29 15:21
 * 开发名称：Account
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Template_Method_Pattern.AbstractClass;

public abstract class Account {
    public boolean validate(String account, String password) {
//        if ()
        return true;
    }

    public abstract void calculateInterest();

    public void display() {
        System.out.println("显示利息");
    }

    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码输入错误");
            return;
        }
        calculateInterest();
        display();
    }
}