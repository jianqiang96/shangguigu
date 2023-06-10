package oop2.Song05_Super;

/*
@User   jianqiang
@Create 2023/5/21 12:51 周日

@Description 
*/
public class Person {
    private String name;
    private int age;
    int id = 1001;

    public Person() {
        System.out.println("Person(){}");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String name, int age)");
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person info1() {
        return null;
    }

    public void eat() {
        System.out.println(name + " 吃饭");
    }

    public void sleep() {
        System.out.println(name + " 睡觉");
    }


}
