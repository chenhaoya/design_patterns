/**
 * 作者：陈浩
 * 时间：2021/9/14 15:19
 * 说明：
 */
package Factory_Method_Pattern.Exercise4;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Create_Factory factory;
        Class aClass = Class.forName("Factory_Method_Pattern.Exercise4.BMW_Factory");
        factory = (Create_Factory) aClass.newInstance();
        Car car = factory.creatCar();
        car.printCar();
    }
}
