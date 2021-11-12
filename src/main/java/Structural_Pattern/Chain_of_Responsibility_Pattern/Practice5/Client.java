/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/12 13:20
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5;

import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.ConcreteHandler.SystemA;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.ConcreteHandler.SystemB;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.ConcreteHandler.SystemC;
import Structural_Pattern.Chain_of_Responsibility_Pattern.Practice5.Handler.Document_help_system;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Document_help_system document_help_system = new SystemA("系统A");
        Document_help_system document_help_system1 = new SystemB("系统B");
        Document_help_system document_help_system2 = new SystemC("系统C");

        document_help_system.setDocument_help_system(document_help_system1);
        document_help_system1.setDocument_help_system(document_help_system2);

        Scanner scanner = new Scanner(System.in);
        document_help_system.processRequest(new PurchaseRequest(scanner.nextLine()));

    }
}