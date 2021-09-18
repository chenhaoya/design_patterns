/**
 * 作者：陈浩
 * 时间：2021/9/18 15:25
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise6.Factory;

import Abstract_Factory_Pattern.Exercise6.ConcreatProduct.IOS_InterfaceController;
import Abstract_Factory_Pattern.Exercise6.ConcreatProduct.IOS_OperationController;
import Abstract_Factory_Pattern.Exercise6.I_A_W_Phone;
import Abstract_Factory_Pattern.Exercise6.InterfaceController;
import Abstract_Factory_Pattern.Exercise6.OperationController;

public class IOS_Factory implements I_A_W_Phone {
    public InterfaceController creatInterfaceController() {
        return new IOS_InterfaceController();
    }

    public OperationController creatOperationController() {
        return new IOS_OperationController();
    }
}
