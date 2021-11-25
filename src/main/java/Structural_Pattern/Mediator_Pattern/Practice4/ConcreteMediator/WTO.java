/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 16:35
 * 开发名称：WTO
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Mediator_Pattern.Practice4.ConcreteMediator;

import Structural_Pattern.Mediator_Pattern.Practice4.Collegeue.Nation;
import Structural_Pattern.Mediator_Pattern.Practice4.ConcreteColleague.America;
import Structural_Pattern.Mediator_Pattern.Practice4.ConcreteColleague.Britain;
import Structural_Pattern.Mediator_Pattern.Practice4.ConcreteColleague.China;
import Structural_Pattern.Mediator_Pattern.Practice4.Mediator.United_Nations;

public class WTO extends United_Nations {
    protected America america;
    protected Britain britain;
    protected China china;

    public WTO(String name_) {
        super(name_);
    }

    @Override
    public void componentChanged(Nation nation) {

    }
}