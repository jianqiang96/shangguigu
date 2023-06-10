package oop2.Song06_Polymorphism;

/*
@User   jianqiang
@Create 2023/5/29 11:58 周一

@Description 
*/
public class PersonTest {
    public static void main(String[] args) {
        // 多态之前的场景
        Person person = new Person();
        Man man = new Man();

        /**
         *  多态性  子类对象的多态性
         *  父类名称 对象名 = new 子类名称()；//多态写法
         *  多态对象在创建时是一个父类对象，可以在有需要的时候变成子类对象。也就是说对象C可以在父类对象和子类对象中切换，它拥有多个形态，这就是多态.
         */
        Person person1 = new Man();
/**
 * 多态性的应用   虚拟方法调用
 *
 * 在多态的场景下 调用方法时
 *      编译时  认为方法是左边的父类的类型方法（即被重写的方法）
 *      执行时  实际执行的是子类重写父类的方法
 *
 *      编译看左边  执行看右边
 */
        person1.eat(); // 调用的是重写后的方法
        person1.walk();

        // 测试属性 是否满足多态性 返回的是父类的成员变量
        System.out.println(person1.age);
    }
}
