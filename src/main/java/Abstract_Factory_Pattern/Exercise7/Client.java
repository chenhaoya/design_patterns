/**
 * 作者：陈浩
 * 时间：2021/9/19 11:53
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise7;

import Abstract_Factory_Pattern.Exercise7.AbstractFactory.W_U_L_Factory;
import Abstract_Factory_Pattern.Exercise7.AbstractProduct.Button;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        W_U_L_Factory w_u_l_factory;
        Class<?> aClass = Class.forName("Abstract_Factory_Pattern.Exercise7.ConcreateFactory.UNIX_Factory");
        w_u_l_factory = (W_U_L_Factory) aClass.newInstance();
        Button button = w_u_l_factory.createButton();
        button.print();
    }
}
