/**
 * 作者：陈浩
 * 时间：2021/9/7 15:38
 * 说明：
 */
package Simple_Factory_Pattern_4;

public class test {
    public static void main(String[] args) {
        Person person = Nvwa.creatPerson('W');
        person.print();
    }
}
