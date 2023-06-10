package oop2.Song04_OverWrite;

/*
@User   jianqiang
@Create 2023/5/21 12:51 周日

@Description 
*/
public class Person {
    private String name;
    private int age;



    public void eat() {
        System.out.println(name + " 吃饭");
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

    public Person info1(){
        return null;
    }
}
