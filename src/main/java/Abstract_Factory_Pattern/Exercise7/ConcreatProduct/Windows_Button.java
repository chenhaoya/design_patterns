/**
 * 作者：陈浩
 * 时间：2021/9/19 11:44
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise7.ConcreatProduct;

import Abstract_Factory_Pattern.Exercise7.AbstractProduct.Button;

public class Windows_Button implements Button {
    public void print() {
        System.out.println("Windows_Button");
    }
}
