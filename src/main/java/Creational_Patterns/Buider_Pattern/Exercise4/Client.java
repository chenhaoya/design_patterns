/**
 * 作者：陈浩
 * 时间：2021/9/28 15:07
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise4;

import Creational_Patterns.Buider_Pattern.Exercise4.Builder.Computer_builder;
import Creational_Patterns.Buider_Pattern.Exercise4.Director.Computer_Controller;
import Creational_Patterns.Buider_Pattern.Exercise4.Product.Computer;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Computer computer;
        Computer_builder computer_builder;
        Class<?> aClass = Class.forName("Creational_Patterns.Buider_Pattern.Exercise4.Concrete_Builder.Desktop_Computer");
        computer_builder=(Computer_builder) aClass.newInstance();

        Computer_Controller computer_controller = new Computer_Controller();


        computer = computer_controller.construct(computer_builder);

        System.out.println(computer.toString());
    }
}
