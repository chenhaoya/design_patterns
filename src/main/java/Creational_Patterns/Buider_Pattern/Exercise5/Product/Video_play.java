/**
 * 作者：陈浩
 * 时间：2021/9/28 15:54
 * 说明：
 */
package Creational_Patterns.Buider_Pattern.Exercise5.Product;

public class Video_play {
    private String displayMenu;
    private String playlist;
    private String mainWindow;
    private String controlStrip;

    public String getDisplayMenu() {
        return displayMenu;
    }

    public void setDisplayMenu(String displayMenu) {
        this.displayMenu = displayMenu;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlStrip() {
        return controlStrip;
    }

    public void setControlStrip(String controlStrip) {
        this.controlStrip = controlStrip;
    }

    @Override
    public String toString() {
        return "Video_play{" +
                "displayMenu='" + displayMenu + '\'' +
                ", playlist='" + playlist + '\'' +
                ", mainWindow='" + mainWindow + '\'' +
                ", controlStrip='" + controlStrip + '\'' +
                '}';
    }
}
