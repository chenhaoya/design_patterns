/**
 * 作者：陈浩
 * 时间：2021/9/14 18:47
 * 说明：
 */
package Creational_Patterns.Factory_Method_Pattern.Exercise4.Exercise4_2;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Car_Factory car;
        Class aClass = Class.forName("Creational_Patterns.Factory_Method_Pattern.Exercise4.Exercise4_2.Creat_Car");
        car = (Car_Factory) aClass.newInstance();
        Car car1 = car.creatFactory("BMW");
        car1.print();
    }
}
