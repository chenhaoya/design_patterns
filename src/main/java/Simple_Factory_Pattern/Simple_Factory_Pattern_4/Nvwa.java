/**
 * 作者：陈浩
 * 时间：2021/9/7 15:19
 * 说明：
 */
package Simple_Factory_Pattern.Simple_Factory_Pattern_4;

public class Nvwa {
    public static Person creatPerson(char type){
        switch (type){
            case 'M':return new Man();
            case 'W':return new Woman();
        }
        return null;
    }
}
