/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/12/14 16:46
 * 开发名称：XMLUtil
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Strategy_Pattern.例题;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse("src/main/java/Behavioral_Patterns/Strategy_Pattern/例题/config.tld");
            NodeList nodeList = document.getElementsByTagName("className");
            Node firstChild = nodeList.item(0).getFirstChild();
            String nodeValue = firstChild.getNodeValue();
            Class<?> aClass = Class.forName(nodeValue);
            Object obj = aClass.newInstance();
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
}