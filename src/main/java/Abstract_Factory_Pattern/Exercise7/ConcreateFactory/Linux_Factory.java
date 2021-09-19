/**
 * 作者：陈浩
 * 时间：2021/9/19 11:52
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise7.ConcreateFactory;

import Abstract_Factory_Pattern.Exercise7.AbstractFactory.W_U_L_Factory;
import Abstract_Factory_Pattern.Exercise7.AbstractProduct.Button;
import Abstract_Factory_Pattern.Exercise7.AbstractProduct.Text;
import Abstract_Factory_Pattern.Exercise7.ConcreatProduct.Linux_Button;
import Abstract_Factory_Pattern.Exercise7.ConcreatProduct.Linux_Text;

public class Linux_Factory implements W_U_L_Factory {
    public Button createButton() {
        return new Linux_Button();
    }

    public Text createText() {
        return new Linux_Text();
    }
}
