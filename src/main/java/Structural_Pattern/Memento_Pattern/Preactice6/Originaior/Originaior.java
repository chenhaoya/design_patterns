/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2021/11/27 20:06
 * 开发名称：Originaior
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package Structural_Pattern.Memento_Pattern.Preactice6.Originaior;

public class Originaior {
    private String name_;
    private int pass_;

    public Originaior(String name_, int pass_) {
        this.name_ = name_;
        this.pass_ = pass_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public int getPass_() {
        return pass_;
    }

    public void setPass_(int pass_) {
        this.pass_ = pass_;
    }

    public Memento saveM(){
        return new Memento(this.name_, this.pass_);
    }

    public void restoreM(Memento memento) {
        this.name_=memento.getName_();
        this.pass_= memento.pass_;
    }

    static public class Memento {
        private String name_;
        private int pass_;

        public String getName_() {
            return name_;
        }

        public void setName_(String name_) {
            this.name_ = name_;
        }

        public int getPass_() {
            return pass_;
        }

        public void setPass_(int pass_) {
            this.pass_ = pass_;
        }

        public Memento(String name_, int pass_) {
            this.name_ = name_;
            this.pass_ = pass_;
        }
    }
}