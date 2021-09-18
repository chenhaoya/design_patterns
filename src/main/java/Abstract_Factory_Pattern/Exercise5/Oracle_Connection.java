/**
 * 作者：陈浩
 * 时间：2021/9/18 15:07
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise5;

public class Oracle_Connection implements Connection{
    public void print() {
        System.out.println("Oracle数据库连接");
    }
}
