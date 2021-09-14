/**
 * 作者：陈浩
 * 时间：2021/9/14 22:15
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise4;

public class TCL_Factory implements HTFactory{
    public AirConditioner createairconditioner() {
        return new TCL_AirConditioner();
    }

    public Television createtelevision() {
        return new TCL_Television();
    }
}
