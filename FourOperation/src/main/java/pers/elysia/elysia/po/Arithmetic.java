package pers.elysia.elysia.po;

/**
 * 算术类,包含运算符,操作数,括号等子类
 * @author 3121005035, OuroborosNo2
 * */
public class Arithmetic {
    //值
    protected String value;
    //优先级
    protected int priority;
    public String toString(){
        return this.value;
    }
}
