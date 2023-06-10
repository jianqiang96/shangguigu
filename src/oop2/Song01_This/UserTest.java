package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/3 10:48 周三

@Description 
*/
public class UserTest {
    public static void main(String[] args) {

        User u1 = new User();
        User u2 = new User("Jreey");
        User u3 = new User("Jreey", 13);

        u1.echoUser();
        u2.echoUser();
        u3.echoUser();
    }
}

class User {
    String name;
    int age;

    String email;

    public User() {
        // 假设此构造器内有部分初始化代码
        this.email = "1@163.com";
    }

    public User(String name) {
        /* 调用空参的 构造器  就调用了初始化代码 */
        this();
        this.name = name;
    }

    public User(String name, int age) {
        // this.name = name;
        /* 调用形参为name的 构造器 */
        this(name);
        this.age = age;
    }

    public void echoUser() {
        System.out.println(this.name + this.age + this.email);
    }
}