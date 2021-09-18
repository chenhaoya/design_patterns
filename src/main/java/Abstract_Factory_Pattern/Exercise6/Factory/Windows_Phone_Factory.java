/**
 * 作者：陈浩
 * 时间：2021/9/18 15:26
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise6.Factory;

import Abstract_Factory_Pattern.Exercise6.ConcreatProduct.WindowsPhone_InterfaceController;
import Abstract_Factory_Pattern.Exercise6.ConcreatProduct.WindowsPhone_OperationController;
import Abstract_Factory_Pattern.Exercise6.I_A_W_Phone;
import Abstract_Factory_Pattern.Exercise6.InterfaceController;
import Abstract_Factory_Pattern.Exercise6.OperationController;

public class Windows_Phone_Factory implements I_A_W_Phone{
    public InterfaceController creatInterfaceController() {
        return new WindowsPhone_InterfaceController();
    }

    public OperationController creatOperationController() {
        return new WindowsPhone_OperationController();
    }
}
