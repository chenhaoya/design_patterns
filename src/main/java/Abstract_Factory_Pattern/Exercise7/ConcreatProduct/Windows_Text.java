/**
 * 作者：陈浩
 * 时间：2021/9/19 11:44
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise7.ConcreatProduct;

import Abstract_Factory_Pattern.Exercise7.AbstractProduct.Text;

public class Windows_Text implements Text {
    public void print() {
        System.out.println("Windows_Text");
    }
}
