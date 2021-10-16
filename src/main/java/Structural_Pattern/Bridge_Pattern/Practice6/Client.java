/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/16 15:45
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：将HBase数据转换为PDF格式文件
 */
package Structural_Pattern.Bridge_Pattern.Practice6;

import Structural_Pattern.Bridge_Pattern.Practice6.Abstraction.Database;
import Structural_Pattern.Bridge_Pattern.Practice6.Implementor.Documentation;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Database database;
        Class<?> aClass = Class.forName("Structural_Pattern.Bridge_Pattern.Practice6.ConccreteImplementor.HBase");
        database = (Database) aClass.newInstance();

        database.setDoc((Documentation)Class.forName("Structural_Pattern.Bridge_Pattern.Practice6.RefinedAbstraction.PDF").newInstance());

        database.parse();
    }
}