package oop1.Song06_Constructor;

/*
@User   jianqiang
@Create 2023/5/1 22:25 周一

@Description 
*/
public class Person {
    String name ;
    int age;

    // 构造器
    public Person(){
        System.out.println("Person()");
    }

    // 构造器重载
    Person(int a){
        age = a;
    }

    // 方法
    public void eat(){
        System.out.println("eat");
    }
}
