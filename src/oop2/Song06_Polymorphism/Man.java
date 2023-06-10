package oop2.Song06_Polymorphism;

/*
@User   jianqiang
@Create 2023/5/29 11:37 周一

@Description 
*/
public class Man extends Person {
    boolean isSmoking;
    int age = 101;

    public void eat() {
        System.out.println("男吃饭");
    }

    public void walk() {
        System.out.println("走了");
    }

    public void test() {
        System.out.println("test");
    }
}