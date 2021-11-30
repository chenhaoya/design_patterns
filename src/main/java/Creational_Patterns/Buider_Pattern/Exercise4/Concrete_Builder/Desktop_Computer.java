/**
 * 作者：陈浩
 * 时间：2021/9/28 14:50
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise4.Concrete_Builder;

import Creational_Patterns.Buider_Pattern.Exercise4.Builder.Computer_builder;

public class Desktop_Computer extends Computer_builder {
    @Override
    public void buildCPU() {
        computer.setCPU("台式机的CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("台式机的内存条");
    }

    @Override
    public void buildHarddisk() {
        computer.setHard_disk("台式机的硬盘");
    }

    @Override
    public void buildHost() {
        computer.setHost("台式机的主机");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("台式机的显示器");
    }
}
