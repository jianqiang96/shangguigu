package oop2.Song06_Polymorphism.exer3;

/*
@User   jianqiang
@Create 2023/5/30 23:24 周二

@Description 
*/
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        // test.method(new Person());
        // test.method(new Student());
        test.method(new Student());
    }

    public void method(Person e) {
        System.out.println(e.getInfo());
/**
 * 方式一
 */
        if (e instanceof Graduate) {
            System.out.println("3");
            System.out.println("2");
            System.out.println("1");
        } else if (e instanceof Student) {
            System.out.println("2");
            System.out.println("1");
        } else if (e instanceof Person) {
            System.out.println("1");
        }

        /**
         * 方式二
         */
        if (e instanceof Graduate) {
            System.out.println("3");
        }
        if (e instanceof Student) {
            System.out.println("2");
        }
        if (e instanceof Person) {
            System.out.println("1");
        }

    }
}
