/**
 * 作者：陈浩
 * 时间：2021/9/28 16:52
 * 说明：
 */
package Buider_Pattern.Exercise5.Director;

import Buider_Pattern.Exercise5.Builder.Video_builder;
import Buider_Pattern.Exercise5.Product.Video_play;

public class Video_Controller {
    public Video_play construct(Video_builder video_builder){
        Video_play video_play;
        video_builder.buildcontrolStrip();
        video_builder.buildDisplayMenu();
        video_builder.buildmainWindow();
        video_builder.buildPlaylist();
        video_play = video_builder.createvideoPlay();
        return video_play;
    }
}
