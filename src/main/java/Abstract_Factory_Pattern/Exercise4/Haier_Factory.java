/**
 * 作者：陈浩
 * 时间：2021/9/14 22:15
 * 说明：
 */
package Abstract_Factory_Pattern.Exercise4;

public class Haier_Factory implements HTFactory{
    public AirConditioner createairconditioner() {
        return new Haier_AirCondtitoner();
    }

    public Television createtelevision() {
        return new Haier_Television();
    }
}
