/**
 * 作者：陈浩
 * 时间：2021/9/14 18:34
 * 说明：
 */
package Creational_Patterns.Factory_Method_Pattern.Exercise5;
/**曲线*/
public class Curve_Factory implements Shape_Factory{
    @Override
    public Shape createShape() {
        return new Curve();
    }
}
