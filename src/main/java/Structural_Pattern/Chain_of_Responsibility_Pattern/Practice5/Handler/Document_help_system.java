package Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.Handler;

import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.PurchaseRequest;

public abstract class Document_help_system {
    //定义后继者
    protected Document_help_system document_help_system;
    //当前环境名称
    protected String name_;

    public Document_help_system(String name_) {
        this.name_ = name_;
    }

//    设置后继者
    public void setDocument_help_system(Document_help_system document_help_system) {
        this.document_help_system = document_help_system;
    }
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
