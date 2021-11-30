/**
 * 作者：陈浩
 * 时间：2021/9/28 16:37
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise5.Concrete_Builder;

import Creational_Patterns.Buider_Pattern.Exercise5.Builder.Video_builder;

public class Full_mode extends Video_builder {
    @Override
    public void buildDisplayMenu() {
        video_play.setDisplayMenu("显示菜单");
    }

    @Override
    public void buildPlaylist() {
        video_play.setPlaylist("播放列表");
    }

    @Override
    public void buildmainWindow() {
        video_play.setMainWindow("主窗口");
    }

    @Override
    public void buildcontrolStrip() {
        video_play.setControlStrip("网络模式");
    }
}
