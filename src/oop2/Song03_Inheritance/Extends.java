package oop2.Song03_Inheritance;

/*
@User   jianqiang
@Create 2023/5/21 12:59 周日

@Description 
*/
public class Extends {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.setName("111");
        ps.eat();

        Student sd = new Student();
        sd.setName("Tom");
        sd.eat();
        System.out.println(sd.getName());

        // ps 的父类
        System.out.println(ps.getClass().getSuperclass());
        System.out.println(sd.getClass().getSuperclass());
        System.out.println(sd.getClass().getSuperclass().getSuperclass());
    }
}