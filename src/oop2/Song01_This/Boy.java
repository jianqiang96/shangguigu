package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/3 22:19 周三

@Description 
*/
public class Boy {
    public Boy() {
    }

    public Boy(String name, int age) {
        this.age = age;
        this.name = name;
    }


    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶" + girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("可以结婚");
        } else {
            System.out.println("不可以结婚");
        }
    }

}
