package oop2.Song01_This;


/*
@User   jianqiang
@Create 2023/5/3 22:24 周三

@Description 
*/
public class Girl {
    public Girl() {
    }

    public Girl(String name, int age) {
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


    // 将Boy对象传递给 Girl 对象的 marry 方法中
    public void marry(Boy boy) {

        System.out.println("我想嫁" + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }
        // return Integer.compare(this.age, girl.age);
    }
}
