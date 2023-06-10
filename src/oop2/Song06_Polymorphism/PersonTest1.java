package oop2.Song06_Polymorphism;

/*
@User   jianqiang
@Create 2023/5/30 13:06 周二

@Description 
*/
public class PersonTest1 {
    public static void main(String[] args) {
        Person person = new Man();

        // 向下转型   使用强转符
        Man man = (Man) person;

        person.eat();
        man.eat();
        man.test();
        ((Man) person).test();

        // man 和 person 指向堆空间中的同一个对象
        if (person instanceof Man) {
            System.out.println(person == man);
        }

        /**
         * 可能会出现 类型转换异常
         * java.lang.ClassCastException
         */
        Person person1 = new Woman();
//        Man man1 = (Man) person1;
//        man1.test();

        /**
         * 可以再向下转型之前 进行判断
         *   instanceof   判断左侧实例 是否是 右侧类的实例
         */
        if (person1 instanceof Man) {
            Man man1 = (Man) person1;
            man1.test();
        }

        if (person1 instanceof Woman) {
            Woman man1 = (Woman) person1;
            man1.goShopping();
        }
/**
 * Beauty子类实例化（多态） 他的父类 Woman 也可以向下转型
 * 转型后 就近原则  重写后的方法被优先调用
 */
        Person person2 = new Beauty();
        if (person2 instanceof Woman) {
            System.out.println("Woman");
            Beauty beauty = (Beauty) person2;
            beauty.putOnMakeup(); // Beauty
            beauty.goShopping(); //Woman
            beauty.eat();  // Woman 类中重写
            beauty.walk(); // Person
        }


    }
}
