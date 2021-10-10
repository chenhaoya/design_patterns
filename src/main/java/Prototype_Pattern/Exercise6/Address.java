/**
 *开发团队：复仇者联盟
 *开发团队领导人：安东尼-爱德华-托尼-斯塔克
 *开发人员姓名：陈浩
 *学号/工号：2019112102
 *个人/公司邮箱：ch111222@qq.com
 *时间：2021/10/10 16:04
 *开发名称：Address.java
 *开发工具：IntelliJ IDEA
 *当前用户：Chenhao
 *说明：
 */
package Prototype_Pattern.Exercise6;

import java.io.Serializable;

/**
 * @author Chenhao
 */
public class Address implements Serializable {
    private String id="Address11";

    public Address() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                '}';
    }
}
