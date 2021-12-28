/**
 * 作者：陈浩
 * 时间：2021/9/18 15:08
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise5;

public class Oracle_Statements implements Statements {
    @Override
    public void print() {
        System.out.println("Oracle的语句对象");
    }
}
