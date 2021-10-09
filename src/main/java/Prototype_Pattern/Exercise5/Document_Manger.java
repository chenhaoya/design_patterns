/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：安东尼-爱德华-托尼-斯塔克
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/9 22:43
 * 开发名称：Document_Manger.java
 * 开发工具：IntelliJ IDEA
 * 当前用户：Chenhao
 * 说明：
 */
package Prototype_Pattern.Exercise5;

import java.io.IOException;
import java.util.Hashtable;

public class Document_Manger {
    private Hashtable documentTable = new Hashtable();

    public Document_Manger() {
        documentTable.put("a",new DocumentA());
        documentTable.put("b",new DocumentB());
    }

    public void add(String key,Document1 document1){
        documentTable.put(key,document1);
    }


    public Document1 getDocumentTable(String key) {
        Document1 clone = null;
        try {
            clone = ((Document1)documentTable.get(key)).deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
