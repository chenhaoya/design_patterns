/**
 * 作者：陈浩
 * 时间：2021/9/28 15:52
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise5;

import Creational_Patterns.Buider_Pattern.Exercise5.Builder.Video_builder;
import Creational_Patterns.Buider_Pattern.Exercise5.Director.Video_Controller;
import Creational_Patterns.Buider_Pattern.Exercise5.Product.Video_play;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Video_play video_play;
        Class<?> aClass = Class.forName("Creational_Patterns.Buider_Pattern.Exercise5.Concrete_Builder.Memory_mode");
        Video_builder video_builder = (Video_builder)aClass.newInstance();
        Video_Controller video_controller = new Video_Controller();
        video_play = video_controller.construct(video_builder);
        System.out.println(video_play.toString());
    }
}
