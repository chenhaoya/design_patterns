/**
 * 作者：陈浩
 * 时间：2021/9/28 14:40
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise4.Builder;

import Creational_Patterns.Buider_Pattern.Exercise4.Product.Computer;

public abstract class Computer_builder {
    protected Computer computer=new Computer();
    public abstract void buildCPU();
    public abstract void buildMemory();
    public abstract void buildHarddisk();
    public abstract void buildHost();
    public abstract void buildDisplay();
    public Computer createComputer(){
        return computer;
    }
}
