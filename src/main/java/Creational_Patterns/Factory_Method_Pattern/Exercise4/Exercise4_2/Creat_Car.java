/**
 * 作者：陈浩
 * 时间：2021/9/14 18:51
 * 说明：
 */
package Creational_Patterns.Factory_Method_Pattern.Exercise4.Exercise4_2;

public class Creat_Car implements Car_Factory {
    @Override
    public Car creatFactory(String args) {
        if (args.equalsIgnoreCase("BMW")) {
            return new BMW_Car();
        } else if (args.equalsIgnoreCase("Benz")) {
            new Benz_Car();
        }
        return null;
    }
}
