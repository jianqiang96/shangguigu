package oop2.Song06_Polymorphism;

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
         */
        test.adop(new Animal());
        test.adop(new Dog());
    }

    // 类声明的是一个 Animal 类型的参数
    public void adop(Animal animal) {
        animal.eat();
        animal.jump();
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