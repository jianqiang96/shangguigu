package oop2.Song05_Super.exer4;

/*
@User   jianqiang
@Create 2023/5/28 20:42 周日

@Description 
*/
public class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}
