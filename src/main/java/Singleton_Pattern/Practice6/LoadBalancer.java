/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/10 21:54
 * 开发名称：LoadBalancer.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：懒汉式双重检查
 */
package Singleton_Pattern.Practice6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Chenhao
 */
public class LoadBalancer {
    //用来存储唯一实例
    private volatile static LoadBalancer instance = null;
    //服务器集合
    private List serverList = null;

    //私有构造

    private LoadBalancer() {
        serverList = new ArrayList();
    }

    public static LoadBalancer getInstanceLazy() {
        if (instance == null) {
            synchronized (LoadBalancer.class) {
                if (instance == null) {
                    instance = new LoadBalancer();
                }
            }
        }
        return instance;
    }

    private static class HolderClass{
        private final static LoadBalancer instance = new LoadBalancer();
    }

    public static LoadBalancer getInstanceIoDH(){
        return HolderClass.instance;
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
