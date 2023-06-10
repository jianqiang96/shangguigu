package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/3 10:18 周三

@Description 
*/
public class PersonTest {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.setAge(10);
        System.out.println(ps.age);
    }
}

class Person {
    String name;
    int age;
    String email;

    Person() {
    }

    Person(String name, String email) {
        // 声明正在创建的对象哪个是成员变量
        this.name = name;
        this.email = email;
    }

    public void setAge(int a) {
        // this 声明 成员变量
        this.age = a;
    }

}
