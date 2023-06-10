package oop1.Song02_Method_overload;

public class Test {
    public static  void  main(String[] args){
        int a = 10;
        int b = 20;
        method(a,b); // static 方法
        // 使用static用于函数定义时，对函数的连接方式产生影响，使得函数只在本文件内部有效，对其他文件是不可见的。
        // 这样的函数又叫作静态函数。使用静态函数的好处是，不用担心与其他文件的同名函数产生干扰，另外也是对函数本身的一种保护机制。

    }

    public static void method(int a, int b){ // static 方法
        a *= 10;
        b *=10;

    }
}
