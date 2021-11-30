/**
 * 作者：陈浩
 * 时间：2021/9/14 21:50
 * 说明：
 */
package Creational_Patterns.Factory_Method_Pattern.Exercise6;

public class JpgReaderFactory implements Image_Reader_Factory{
    public Image_Reader createImageRead() {
        return new JpgReader();
    }
}
