/**
 * 作者：陈浩
 * 时间：2021/9/14 16:07
 * 说明：
 */
package Creational_Patterns.Factory_Method_Pattern.Exercise5;

/**
 * @author 陈浩
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Shape_Factory shape_factory;
        Class<?> aClass = Class.forName("Creational_Patterns.Factory_Method_Pattern.Exercise5.Curve_Factory");
        shape_factory = (Shape_Factory) aClass.newInstance();
        Shape shape = shape_factory.createShape();
        shape.print();
    }
}