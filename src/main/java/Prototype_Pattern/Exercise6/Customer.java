/**
 *开发团队：复仇者联盟
 *开发团队领导人：安东尼-爱德华-托尼-斯塔克
 *开发人员姓名：陈浩
 *学号/工号：2019112102
 *个人/公司邮箱：ch111222@qq.com
 *时间：2021/10/10 16:04
 *开发名称：Customer.java
 *开发工具：IntelliJ IDEA
 *当前用户：Chenhao
 *说明：
 */
package Prototype_Pattern.Exercise6;

import java.io.*;

/**
 * @author Chenhao
 */
public class Customer implements Serializable,Cloneable {
    private String id = "Customer11";
    private Address address = new Address();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        Object obj=null;
        try {
            obj = super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("不支持");
            return null;
        }
        return (Customer)obj;
    }

    protected Customer deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (Customer) objectInputStream.readObject();
    }
}
