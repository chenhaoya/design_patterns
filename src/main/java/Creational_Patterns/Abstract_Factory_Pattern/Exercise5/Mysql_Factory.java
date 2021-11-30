/**
 * 作者：陈浩
 * 时间：2021/9/18 15:01
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise5;

public class Mysql_Factory implements M_O_Factory {

    public Connection creatConnection() {
        return new Mysql_Connection();
    }

    public Statements creatStatements() {
        return new Mysql_Statements();
    }
}
