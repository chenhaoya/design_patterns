/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 13:55
 * 开发名称：Manager
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6.ConcreteHandler;

import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6.Handler.Spice_approval;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice6.Splendid;

public class Manager extends Spice_approval {
    public Manager(String position) {
        super(position);
    }

    @Override
    public void setSpice_approval(Spice_approval spice_approval) {
        super.setSpice_approval(spice_approval);
    }

    @Override
    public void processResponse(Splendid splendid) {
        if (splendid.getDay()>=3&&splendid.getDay()<10){
            System.out.println("处理者："+this.position);
        }else{
            this.spice_approval.processResponse(splendid);
        }
    }
}