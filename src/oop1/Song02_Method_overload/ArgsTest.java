package oop1.Song02_Method_overload;

public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest at = new ArgsTest();

        at.print();
        at.print(1);
        at.print(1, 1); // 方法重载
        at.print(1, 1, 4);
        at.print(new int[]{1, 2, 3});
    }

    // 可变个数形参 其实就是转换为对应类型的数组变量
    public void print(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    // 方法重载
    public void print(int i, int j) {
        System.out.println(333);
    }
}
