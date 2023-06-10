package oop2.Song06_Polymorphism.exer2;

/*
@User   jianqiang
@Create 2023/5/29 17:40 周一

@Description 
*/
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        /**
         * 多态的主要应用场景  传递不确定的实例对象
         * 向上转型  Dog 实例传递到 Animal 类型
         */
        test.adop(new Dog());
        test.adop(new Cat());


    }

    // 类声明的是一个 Animal 类型的参数
    public void adop(Animal animal) {
        animal.eat();
        animal.jump();

        /**
         * 向下转型
         * Dog类为 animal 对象的子类
         * 则将 animal 实例转为 dog
         * 判断左侧实例 是否是 右侧类的实例
         */
        if (animal instanceof Dog) {
            // 将 animal实例转换为 Dog类型实例
            Dog dog1 = (Dog) animal;
            dog1.watchDoor();
        }
        if (animal instanceof Cat) {
            Cat cat1 = (Cat) animal;
            cat1.catchMouse();
        }

    }
}

class Animal {
    public void eat() {
        System.out.println("动物进食");
    }

    public void jump() {
        System.out.println("动物跳");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫进食");
    }

    public void jump() {
        System.out.println("猫跳");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗进食");
    }

    public void jump() {
        System.out.println("狗跳");
    }

    public void watchDoor() {
        System.out.println("kk");
    }
}