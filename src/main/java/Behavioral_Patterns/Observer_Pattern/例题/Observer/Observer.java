package Behavioral_Patterns.Observer_Pattern.例题.Observer;

import Behavioral_Patterns.Observer_Pattern.例题.Subject.AllyControlCenter;

public interface Observer {
    String getName();
    void setName(String name_);
    /**声明支援方法*/
    void help_();
    /**声明遭受攻击方法*/
    void beAttacked(AllyControlCenter allyControlCenter);
}
