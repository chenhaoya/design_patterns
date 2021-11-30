/**
 * 作者：陈浩
 * 时间：2021/9/18 15:52
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise6;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        I_A_W_Phone i_a_w_phone;
        Class<?> aClass = Class.forName("Creational_Patterns.Abstract_Factory_Pattern.Exercise6.Factory.IOS_Factory");
        i_a_w_phone = (I_A_W_Phone) aClass.newInstance();
        InterfaceController interfaceController = i_a_w_phone.creatInterfaceController();
        interfaceController.interfaceController();
    }
}
