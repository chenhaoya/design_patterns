/**
 * 作者：陈浩
 * 时间：2021/9/28 15:00
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise4.Concrete_Builder;

import Creational_Patterns.Buider_Pattern.Exercise4.Builder.Computer_builder;

public class Host extends Computer_builder {
    @Override
    public void buildCPU() {
        computer.setCPU("服务器的CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("服务器的内存条");
    }

    @Override
    public void buildHarddisk() {
        computer.setHard_disk("服务器的硬盘");
    }

    @Override
    public void buildHost() {
        computer.setHost("服务器的主机");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("null");
    }
}
