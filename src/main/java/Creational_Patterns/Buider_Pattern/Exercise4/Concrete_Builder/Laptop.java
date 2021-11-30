/**
 * 作者：陈浩
 * 时间：2021/9/28 14:58
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise4.Concrete_Builder;

import Creational_Patterns.Buider_Pattern.Exercise4.Builder.Computer_builder;

public class Laptop extends Computer_builder {
    @Override
    public void buildCPU() {
        computer.setCPU("笔记本的CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("笔记本的内存条");
    }

    @Override
    public void buildHarddisk() {
        computer.setHard_disk("笔记本的硬盘");
    }

    @Override
    public void buildHost() {
        computer.setHost("笔记本的主机");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("笔记本的屏幕");
    }
}
