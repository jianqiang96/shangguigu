package oop2.Song07_Object.equals;

import java.util.Objects;

/*
@User   jianqiang
@Create 2023/6/3 20:04 周六

@Description 
*/
public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Tom", 12);
        User user2 = new User("Tom", 12);
        System.out.println(user1.equals(user2)); // false  重写后为 true
        System.out.println();

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);  // false
        System.out.println(str1.equals(str2)); // true


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重写 equals
     *
     * @param obj
     * @return
     */
    public boolean equals1(Object obj) {
        // 内存地址是否一致
        if (this == obj) {
            return true;
        }
        /*
        其实instanceof就是一个操作符，语法形式很简单：
        A通常是引用变量，B通常是一个类或者是接口，表示的含义有三个：
            （1）A是否是B的实例，
            （2）A是否是B子类的实例
            （3）A是否是B接口实现类的实例
        也就是说我们平时使用instanceof关键字一般作为判断左右两侧是否有继承或者是实现关系
        */
        if (obj instanceof User) {
            // 将入参对象 强转为 User 类型对象
            User user = (User) obj;
            return this.age == user.age && this.name.equals(user.name);
        } else {
            return false;
        }
    }

    /**
     * IDE 自动实现
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
}
