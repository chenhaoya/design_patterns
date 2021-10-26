/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/26 15:38
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Facade_Pattern.Practice6;

import Structural_Pattern.Facade_Pattern.Practice6.Facade.Abstract_Backup;
import Structural_Pattern.Facade_Pattern.Practice6.Facade.SD_Backup;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Abstract_Backup abstract_backup;
        Class aClass = Class.forName("Structural_Pattern.Facade_Pattern.Practice6.Facade.SD_Backup");
        abstract_backup = (Abstract_Backup) aClass.newInstance();
        abstract_backup.fileBackup();
    }
}