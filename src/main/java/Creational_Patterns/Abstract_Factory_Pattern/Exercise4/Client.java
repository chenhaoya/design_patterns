/**
 * 作者：陈浩
 * 时间：2021/9/14 22:32
 * 说明：
 */
package Creational_Patterns.Abstract_Factory_Pattern.Exercise4;

/**
 * @author 陈浩
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        HTFactory htFactory;
        Class<?> aClass = Class.forName("Creational_Patterns.Abstract_Factory_Pattern.Exercise4.TCL_Factory");
        htFactory = (HTFactory) aClass.newInstance();
        AirConditioner createairconditioner = htFactory.createairconditioner();
        createairconditioner.changeTemperature();
    }
}
