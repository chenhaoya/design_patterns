/**
 * 作者：陈浩
 * 时间：2021/9/14 21:50
 * 说明：
 */
package Factory_Method_Pattern.Exercise6;

public class GifReaderFactory implements Image_Reader_Factory{
    public Image_Reader createImageRead() {
        return new GifRead();
    }
}
