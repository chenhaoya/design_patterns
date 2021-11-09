/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/8 15:22
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Proxy_Pattern.Practice6;

import Structural_Pattern.Proxy_Pattern.Practice6.Proxy.ProxyBBS;
import Structural_Pattern.Proxy_Pattern.Practice6.Subject.BBS;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ProxyBBS proxyBBS = new ProxyBBS("aaaa",2);
        proxyBBS.edit_personal_infomation();
    }
}