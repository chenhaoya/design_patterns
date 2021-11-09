/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/9 16:39
 * 开发名称：Yingzhang
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Chain_of_Responsibility_Pattern.Practice4.ConcreteHandler;

import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice4.Handler.Approver;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice4.War_Request;

public class Yingzhang extends Approver {
    public Yingzhang(String name_) {
        super(name_);
    }

    @Override
    public void setSuccessor(Approver successor) {
        super.setSuccessor(successor);
    }

    @Override
    public void processResponse(War_Request request) {
        if (request.getNumber_() >= 50 && request.getNumber_()<200) {
            System.out.println(this.name_+"递交的任务书");
            System.out.println("指挥；" + this.name_ + "规模：" + request.getNumber_()+"作战名："+request.getWar_name());
        } else {
            this.approver.processResponse(request);
        }
    }
}