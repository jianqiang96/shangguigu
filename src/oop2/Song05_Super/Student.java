package oop2.Song05_Super;

/*
@User   jianqiang
@Create 2023/5/21 12:53 周日

@Description 
*/

// 继承父类
public class Student extends Person {
    String school;
    int id = 1002;

    public void Study() {
        System.out.println("学习");
    }

    public void eat() {
        System.out.println(getName() + " 不吃饭");
    }

    public void sleep() {
        System.out.println(getName() + " 不睡觉");
    }

    public void show() {
        // 当前类已经重写过的方法
        this.eat();
        eat();
        // 继承的父类中的方法  在子类中调用父类中被重写的方法
        super.eat();
    }

    public void show1() {
        System.out.println(id);
        // 区分子类和父类中定义的同名属性
        System.out.println(super.id);
    }


    public Student() {
        // 子类调用父类的构造器  空参构造器
        // super();
        System.out.println("Student(){}");
    }

    public Student(String name, int age) {
        // 会默认加上 super();  除非显式的指定
        super("wang",99);
    }
}
