/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/25 16:35
 * 开发名称：WHO
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteMediator;

import Behavioral_Patterns.Mediator_Pattern.Practice4.Collegeue.Nation;
import Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteColleague.America;
import Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteColleague.Britain;
import Behavioral_Patterns.Mediator_Pattern.Practice4.ConcreteColleague.China;
import Behavioral_Patterns.Mediator_Pattern.Practice4.Mediator.United_Nations;

public class WHO extends United_Nations {
    public WHO(String name_) {
        super(name_);
    }

    protected America america;
    protected Britain britain;
    protected China china;
    @Override
    public void componentChanged(Nation nation) {
        if (this.country.containsKey(nation.getName_())) {
            nation.illustrate(this.name_);
        }else{
            System.out.printf(nation.getName_()+"不是"+this.name_+"成员");
        }
    }
}