/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 13:28
 * 开发名称：SystemC
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.ConcreteHandler;

import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.Handler.Document_help_system;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.PurchaseRequest;

public class SystemC extends Document_help_system {
    public SystemC(String name_) {
        super(name_);
    }

    @Override
    public void setDocument_help_system(Document_help_system document_help_system) {
        super.setDocument_help_system(document_help_system);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        //可以处理查询关键词长度小于15的请求
        if ((purchaseRequest.getRequest_name()).length()>10){
            System.out.println("处理者："+this.name_+"\n处理了："+purchaseRequest.getRequest_name());
        }else {
            this.document_help_system.processRequest(purchaseRequest);
        }
    }
}