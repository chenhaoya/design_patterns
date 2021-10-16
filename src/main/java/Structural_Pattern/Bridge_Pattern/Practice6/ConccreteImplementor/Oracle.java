/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/16 15:41
 * 开发名称：Oracle
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 */
package Structural_Pattern.Bridge_Pattern.Practice6.ConccreteImplementor;

import Structural_Pattern.Bridge_Pattern.Practice6.Abstraction.Database;

public class Oracle extends Database {
    @Override
    public void parse() {
        System.out.println("Oracle数据转");
        doc.operationimpl();
    }
}