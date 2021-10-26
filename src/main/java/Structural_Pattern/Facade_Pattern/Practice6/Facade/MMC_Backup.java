/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/26 15:42
 * 开发名称：MMC_Backup
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Facade_Pattern.Practice6.Facade;

import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Address_book;
import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Music;
import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Photo;
import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Short_message;

public class MMC_Backup extends Abstract_Backup{


    @Override
    public void fileBackup() {
        address_book.backup();
        music.backup();
        photo.backup();
        short_message.backup();
        System.out.println("以备份到MMC");
    }

    public MMC_Backup() {
        super();
    }
}