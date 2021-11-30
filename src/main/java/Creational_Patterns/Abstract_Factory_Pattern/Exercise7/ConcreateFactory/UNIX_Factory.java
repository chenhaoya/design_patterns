/**
 * 作者：陈浩
 * 时间：2021/9/19 11:51
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise7.ConcreateFactory;

import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractFactory.W_U_L_Factory;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractProduct.Button;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractProduct.Text;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.ConcreatProduct.UNIX_Button;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.ConcreatProduct.UNIX_Text;

public class UNIX_Factory implements W_U_L_Factory {
    public Button createButton() {
        return new UNIX_Button();
    }

    public Text createText() {
        return new UNIX_Text();
    }
}
