package oop1.Song03_Recursive_method;

public class RecursionTest {
    public static void main(String[] args) {

        RecursionTest rt = new RecursionTest();

        System.out.println(rt.getSum(100));
        System.out.println(rt.getSum1(5));
    }

    public int getSum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public int getSum1(int num) {
        if (num == 1) {
            return 1;
        } else {
            //System.out.println("return  getSum1 (" + num + " - 1) + " + num);
            return num + getSum1(num - 1);
        }


    }
}
