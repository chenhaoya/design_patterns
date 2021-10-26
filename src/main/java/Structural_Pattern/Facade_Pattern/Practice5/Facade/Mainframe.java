/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/26 15:18
 * 开发名称：Mainframe
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Facade_Pattern.Practice5.Facade;

import Structural_Pattern.Facade_Pattern.Practice5.SubSystem.CPU;
import Structural_Pattern.Facade_Pattern.Practice5.SubSystem.HardDisk;
import Structural_Pattern.Facade_Pattern.Practice5.SubSystem.Memory;
import Structural_Pattern.Facade_Pattern.Practice5.SubSystem.OS;

public class Mainframe {
    CPU cpu;
    HardDisk hardDisk;
    Memory memory;
    OS os;
    public Mainframe(){
        this.cpu=new CPU();
        this.memory=new Memory();
        this.hardDisk=new HardDisk();
        this.os=new OS();
    }
    public void on(){
        if(cpu.run()&&hardDisk.read()&& memory.check_()&&os.load()){
            System.out.println("电脑开机了");
        }else{
            // .........
            System.out.println("电脑自检未通过");
        }
    }
}