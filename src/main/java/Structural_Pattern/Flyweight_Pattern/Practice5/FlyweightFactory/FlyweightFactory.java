/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/31 11:59
 * 开发名称：FlyweightFactory
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Flyweight_Pattern.Practice5.FlyweightFactory;

import Structural_Pattern.Flyweight_Pattern.Practice5.ConcreteFlyweight.Picture;
import Structural_Pattern.Flyweight_Pattern.Practice5.ConcreteFlyweight.Video;
import Structural_Pattern.Flyweight_Pattern.Practice5.Flyweight.FILE;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map flyweight_ = new HashMap();

    public FILE getFlyweight_(String key) {
        if (flyweight_.containsKey(key)){
            return (FILE) flyweight_.get(key);
        }else {
            FILE f = null;
            if (key.equalsIgnoreCase("Video")){
                f = new Video("视频");
            }else if (key.equalsIgnoreCase("Picture")){
                f = new Picture("图片");
            }
            flyweight_.put(key,f);
            return f;
        }
    }
}