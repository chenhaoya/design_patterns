/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/10 22:05
 * 开发名称：Client_Lazy.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Singleton_Pattern.Practice6;

/**
 * @author Chenhao
 */
public class Client_Lazy {
    public static void main(String[] args) {
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1=LoadBalancer.getInstanceLazy();
        balancer2=LoadBalancer.getInstanceLazy();
        balancer3=LoadBalancer.getInstanceLazy();
        balancer4=LoadBalancer.getInstanceLazy();

        if (balancer1 == balancer2&&balancer2==balancer3&&balancer3==balancer4) {
            System.out.println("服务器负载均衡器具有唯一性。");
        }

        balancer1.addServer("Server1");
        balancer1.addServer("Server2");
        balancer1.addServer("Server3");
        balancer1.addServer("Server4");


        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求值服务器：" + server);
        }

        LoadBalancer s1,s2;
        s1=LoadBalancer.getInstanceIoDH();
        s2=LoadBalancer.getInstanceIoDH();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
    }
}
