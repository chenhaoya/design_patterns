/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/25 16:15
 * 开发名称：Facade
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Facade_Pattern.Facade;

import Structural_Pattern.Facade_Pattern.SubSystem.Convert_to_XML;
import Structural_Pattern.Facade_Pattern.SubSystem.Report_display;
import Structural_Pattern.Facade_Pattern.SubSystem.Statistical_Analysis;

public class Facade extends Abstract_Facade {
    private Convert_to_XML convertToXml;
    private Report_display reportDisplay;
    private Statistical_Analysis statisticalAnalysis;

    public Facade() {
        this.reportDisplay = new Report_display();
        this.convertToXml = new Convert_to_XML();
        this.statisticalAnalysis = new Statistical_Analysis();
    }

    @Override
    public void file_processing(String fileName) {
        int index = fileName.indexOf('.');
        //获得扩展名
        String aa = fileName.substring(index+1, fileName.length());
        if (! "xml".equals(aa)) {
            convertToXml.convertToxml();
        }
        reportDisplay.report_display();
        statisticalAnalysis.statisticsAnalysis();
    }
}