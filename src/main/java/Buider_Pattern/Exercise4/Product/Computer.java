/**
 * 作者：陈浩
 * 时间：2021/9/28 14:41
 * 说明：
 */
package Buider_Pattern.Exercise4.Product;

public class Computer {
    private String CPU;
    private String memory;
    private String hard_disk;
    private String host;
    private String display;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHard_disk() {
        return hard_disk;
    }

    public void setHard_disk(String hard_disk) {
        this.hard_disk = hard_disk;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", memory='" + memory + '\'' +
                ", hard_disk='" + hard_disk + '\'' +
                ", host='" + host + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
