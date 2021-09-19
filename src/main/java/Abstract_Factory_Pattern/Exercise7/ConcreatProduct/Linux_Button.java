/**
 * 作者：陈浩
 * 时间：2021/9/19 11:46
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise7.ConcreatProduct;

import Abstract_Factory_Pattern.Exercise7.AbstractProduct.Button;

public class Linux_Button implements Button{
    public void print() {
        System.out.println("Linux_Button");
    }
}
