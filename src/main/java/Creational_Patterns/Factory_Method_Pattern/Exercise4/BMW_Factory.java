/**
 * 作者：陈浩
 * 时间：2021/9/14 15:14
 * 说明：
 */
package Creational_Patterns.Factory_Method_Pattern.Exercise4;

public class BMW_Factory implements Create_Factory {
    public Car creatCar() {
        return new BMW_Car();
    }
}
