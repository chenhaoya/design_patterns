/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/2 16:15
 * 开发名称：Client
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Proxy_Pattern.Practice5;

import Structural_Pattern.Proxy_Pattern.Practice5.Proxy.Proxy_Log;

public class Client{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Proxy_Log proxy_log;
        Class<?> aClass = Class.forName("Structural_Pattern.Proxy_Pattern.Practice5.Proxy.Proxy_Log");
        proxy_log = (Proxy_Log) aClass.newInstance();
        proxy_log.login("aaa", "bbb");
    }
}