/**
 * 作者：陈浩
 * 时间：2021/9/7 15:46
 * 说明：
 */
package Creational_Patterns.Simple_Factory_Pattern.Simple_Factory_Pattern5;

public class Shape_Factory {
    public static Shape getShape(String args) {
        Shape shape = null;
        try {
            if (args.equalsIgnoreCase("Circle")){
                shape = new Circle();
            }else if (args.equalsIgnoreCase("Triangle")){
                shape = new Triangle();
            }else if (args.equalsIgnoreCase("Rectangle")){
                shape = new Rectangle();
            }else {
                throw new UnsupportedShapeException("UnsupportedShapeException");
            }
        }catch (UnsupportedShapeException e1){
            System.out.println(e1.fillInStackTrace());
            return shape;
        }finally {
            return shape;
        }
    }
}
class UnsupportedShapeException extends Exception{
    public UnsupportedShapeException(){
        super();
    }
    public UnsupportedShapeException(String s){
        super();
    }
}
