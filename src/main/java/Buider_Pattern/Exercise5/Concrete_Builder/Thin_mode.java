/**
 * 作者：陈浩
 * 时间：2021/9/28 16:39
 * 说明：
 */
package Buider_Pattern.Exercise5.Concrete_Builder;

import Buider_Pattern.Exercise5.Builder.Video_builder;

public class Thin_mode extends Video_builder {
    @Override
    public void buildDisplayMenu() {

    }

    @Override
    public void buildPlaylist() {

    }

    @Override
    public void buildmainWindow() {
        video_play.setMainWindow("主窗口");
    }

    @Override
    public void buildcontrolStrip() {
        video_play.setControlStrip("控制条");
    }
}
