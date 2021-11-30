/**
 * 作者：陈浩
 * 时间：2021/9/18 15:05
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise5;

public class Mysql_Statements implements Statements {
    public void print() {
        System.out.println("Mysql的语句对象");
    }
}
