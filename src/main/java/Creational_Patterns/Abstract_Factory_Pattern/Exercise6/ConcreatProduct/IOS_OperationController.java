/**
 * 作者：陈浩
 * 时间：2021/9/18 15:38
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise6.ConcreatProduct;

import Creational_Patterns.Abstract_Factory_Pattern.Exercise6.OperationController;

public class IOS_OperationController implements OperationController {
    @Override
    public void operationConteroller() {
        System.out.println("IOS的游戏界面控制");
    }
}
