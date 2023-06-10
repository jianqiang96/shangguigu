package oop2.Song04_OverWrite;

/*
@User   jianqiang
@Create 2023/5/21 12:53 周日

@Description 
*/

// 继承父类
public class Student extends Person {
    String school;

    public void Study() {
        System.out.println("学习");
    }

    // 方法重写   父类的方法不符合现在的需求
    public void eat() {
        System.out.println(getName() + " 不吃饭");
    }

    // 父类被重写的方法返回值为基本数据类型，则重写的方法返回值必须相同
    public int getAge() {
        return 1;
    }

    // 父类被重写的方法返回值为引用数据类型，则重新的方法返回值类型 可以与父类相同或者为被重写方法的返回值类型的子类
    public Student info1() {
        return null;
    }


}
