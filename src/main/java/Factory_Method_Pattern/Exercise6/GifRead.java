/**
 * 作者：陈浩
 * 时间：2021/9/14 21:52
 * 说明：
 */
package Factory_Method_Pattern.Exercise6;

public class GifRead implements Image_Reader{
    public void readimage() {
        System.out.println("Gif转XML");
    }
}
