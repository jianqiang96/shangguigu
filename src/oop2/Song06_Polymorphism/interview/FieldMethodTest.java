package oop2.Song06_Polymorphism.interview;

/*
@User   jianqiang
@Create 2023/5/31 0:47 周三

@Description 
*/
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count); // 20
        sub.display();// 20
        Base base = sub;  // 多态   左边父类  右边子类实例
        System.out.println(base == sub); // true
        System.out.println(base.count); // 10
        base.display(); // 20
    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}