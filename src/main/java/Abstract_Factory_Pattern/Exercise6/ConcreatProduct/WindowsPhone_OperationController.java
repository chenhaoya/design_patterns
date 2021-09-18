/**
 * 作者：陈浩
 * 时间：2021/9/18 15:39
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise6.ConcreatProduct;

import Abstract_Factory_Pattern.Exercise6.OperationController;

public class WindowsPhone_OperationController implements OperationController {
    public void operationConteroller() {
        System.out.println("Windows Phone的游戏操作界面");
    }
}
