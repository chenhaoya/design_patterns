/**
 * 作者：陈浩
 * 时间：2021/9/18 15:37
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise6.ConcreatProduct;

import Creational_Patterns.Abstract_Factory_Pattern.Exercise6.InterfaceController;

public class WindowsPhone_InterfaceController implements InterfaceController {
    public void interfaceController() {
        System.out.println("WindowsPhone的游戏操作控制");
    }
}
