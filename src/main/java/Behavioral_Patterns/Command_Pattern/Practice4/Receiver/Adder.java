/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 15:08
 * 开发名称：Adder
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Command_Pattern.Practice4.Receiver;

public class Adder {
    private int num=0;
    public int add_(int value){
        this.num+=value;
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //获取当前状态
    public int getNum() {
        return num;
    }
}