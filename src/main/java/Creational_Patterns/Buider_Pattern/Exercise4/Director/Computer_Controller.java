/**
 * 作者：陈浩
 * 时间：2021/9/28 15:04
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise4.Director;

import Creational_Patterns.Buider_Pattern.Exercise4.Builder.Computer_builder;
import Creational_Patterns.Buider_Pattern.Exercise4.Product.Computer;

public class Computer_Controller {
    public Computer construct(Computer_builder computer_builder){
        Computer computer;
        computer_builder.buildCPU();
        computer_builder.buildMemory();
        computer_builder.buildHarddisk();
        computer_builder.buildHost();
        computer_builder.buildDisplay();
        computer=computer_builder.createComputer();
        return computer;
    }
}
