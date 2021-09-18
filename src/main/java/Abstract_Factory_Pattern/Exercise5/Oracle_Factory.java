/**
 * 作者：陈浩
 * 时间：2021/9/18 15:06
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise5;

public class Oracle_Factory implements M_O_Factory{
    public Connection creatConnection() {
        return new Oracle_Connection();
    }

    public Statements creatStatements() {
        return new Oracle_Statements();
    }
}
