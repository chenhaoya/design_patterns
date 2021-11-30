/**
 * 作者：陈浩
 * 时间：2021/9/19 11:50
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise7.ConcreateFactory;

import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractFactory.W_U_L_Factory;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractProduct.Button;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractProduct.Text;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.ConcreatProduct.Windows_Button;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.ConcreatProduct.Windows_Text;

public class Windows_Factory implements W_U_L_Factory {
    public Button createButton() {
        return new Windows_Button();
    }

    public Text createText() {
        return new Windows_Text();
    }
}
