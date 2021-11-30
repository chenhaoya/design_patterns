/**
 * 作者：陈浩
 * 时间：2021/9/28 16:05
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise5.Builder;

import Creational_Patterns.Buider_Pattern.Exercise5.Product.Video_play;

public abstract class Video_builder {
     protected Video_play video_play = new Video_play();
     public abstract void buildDisplayMenu();
     public abstract void buildPlaylist();
     public abstract void buildmainWindow();
     public abstract void buildcontrolStrip();
     public Video_play createvideoPlay(){
         return video_play;
     }
}
