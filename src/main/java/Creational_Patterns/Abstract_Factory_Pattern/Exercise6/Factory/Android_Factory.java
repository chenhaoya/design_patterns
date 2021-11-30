/**
 * 作者：陈浩
 * 时间：2021/9/18 15:26
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise6.Factory;

import Creational_Patterns.Abstract_Factory_Pattern.Exercise6.ConcreatProduct.Android_InterfaceController;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise6.ConcreatProduct.Android_OperationController;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise6.I_A_W_Phone;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise6.InterfaceController;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise6.OperationController;

public class Android_Factory implements I_A_W_Phone {
    public InterfaceController creatInterfaceController() {
        return new Android_InterfaceController();
    }

    public OperationController creatOperationController() {
        return new Android_OperationController();
    }
}
