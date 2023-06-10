package oop2.Song07_Object.ToString;

import java.io.File;
import java.util.Date;

/*
@User   jianqiang
@Create 2023/6/6 23:07 周二

@Description 
*/
public class ToStringTest {

    public static void main(String[] args) {
        User user = new User("1", 1);
        // oop2.Song07_Object.ToString.User@1b6d3586
        // 方法重写后 User{name='1', age=1}
        System.out.println(user.toString());

        // getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(user); // oop2.Song07_Object.ToString.User@1b6d3586

        String string = new String("hello"); // hello
        File file = new File("C:\\txt.zip"); // C:\txt.zip
        Date date = new Date(); // Wed Jun 07 17:42:28 CST 2023
        System.out.println(string.toString());
        System.out.println(file.toString());
        System.out.println(date.toString());
    }
}

class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写Object类中toString
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}