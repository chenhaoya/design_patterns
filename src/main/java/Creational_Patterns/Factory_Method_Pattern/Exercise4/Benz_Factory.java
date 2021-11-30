/**
 * 作者：陈浩
 * 时间：2021/9/14 15:16
 * 说明：
 */
package Creational_Patterns.Factory_Method_Pattern.Exercise4;

public class Benz_Factory implements Create_Factory {
    public Car creatCar() {
        return new Benz_Car();
    }
}
