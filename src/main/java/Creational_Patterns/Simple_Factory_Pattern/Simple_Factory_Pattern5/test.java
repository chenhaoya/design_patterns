/**
 * 作者：陈浩
 * 时间：2021/9/7 16:00
 * 说明：
 */
package Creational_Patterns.Simple_Factory_Pattern.Simple_Factory_Pattern5;

public class test {
    public static void main(String[] args) {
        Shape shape = Shape_Factory.getShape("ircle");
        //Shape.draw();
    }
}
