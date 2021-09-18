/**
 * 作者：陈浩
 * 时间：2021/9/18 15:09
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise5;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        M_O_Factory m_o_factory;
        Class<?> aClass = Class.forName("Abstract_Factory_Pattern.Exercise5.Mysql_Factory");
        m_o_factory = (M_O_Factory) aClass.newInstance();
        Connection connection = m_o_factory.creatConnection();
        connection.print();
    }
}
