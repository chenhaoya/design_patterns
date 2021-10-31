/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/10/31 11:57
 * 开发名称：Video
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Flyweight_Pattern.Practice5.ConcreteFlyweight;

import Structural_Pattern.Flyweight_Pattern.Practice5.Flyweight.FILE;

public class Video implements FILE {
    private String type_;

    public Video(String type_) {
        this.type_ = type_;
    }

    public void setType_(String type_) {
        this.type_ = type_;
    }

    @Override
    public String getType_() {
        return null;
    }
}