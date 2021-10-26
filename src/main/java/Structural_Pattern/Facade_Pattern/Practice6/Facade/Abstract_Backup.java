/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/26 15:40
 * 开发名称：Abstract_Backup
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Facade_Pattern.Practice6.Facade;

import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Address_book;
import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Music;
import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Photo;
import Structural_Pattern.Facade_Pattern.Practice6.SubSystem.Short_message;

public abstract class Abstract_Backup {
    protected Address_book address_book;
    protected Music music;
    protected Photo photo;
    protected Short_message short_message;
    public abstract void fileBackup();

    public Abstract_Backup() {
        this.address_book=new Address_book();
        this.music=new Music();
        this.photo=new Photo();
        this.short_message=new Short_message();
    }
}