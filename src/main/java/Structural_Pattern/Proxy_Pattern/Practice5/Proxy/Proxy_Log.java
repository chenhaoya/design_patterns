/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/2 15:53
 * 开发名称：Proxy_Log
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Proxy_Pattern.Practice5.Proxy;

import Structural_Pattern.Proxy_Pattern.Practice5.RealSubject.Business1;
import Structural_Pattern.Proxy_Pattern.Practice5.RealSubject.Logger;
import Structural_Pattern.Proxy_Pattern.Practice5.Subject.Interface_Business;


public class Proxy_Log implements Interface_Business {
    private Business1 business1 ;
    private Logger logger;


    @Override
    public void method(String value1,String value2) {
        if (this.login(value1,value2)){
            business1 = new Business1();
            business1.method(value1,value2);
        }else {

        }

    }

    public boolean login(String value1,String value2){
        logger = new Logger();
        return logger.validate_(value1,value2);
    }

}