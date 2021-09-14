/**
 * 作者：陈浩
 * 时间：2021/9/14 18:35
 * 说明：
 */
package Factory_Method_Pattern.Exercise5;
/**柱状*/
public class Columnar_Factory implements Shape_Factory{
    public Shape createShape() {
        return new Columnar();
    }
}
