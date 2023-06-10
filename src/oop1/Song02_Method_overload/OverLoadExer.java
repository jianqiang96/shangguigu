package oop1.Song02_Method_overload;

public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer ole = new OverLoadExer();

        System.out.println(ole.max(1,2));
        System.out.println(ole.max((double)  1, 3));

        char[] arr1 = new char[]{'a','b','c'};
        System.out.println(arr1);
    }


    public int max(int i, int j) {
        return (i >= j) ? i : j;
    }

    public double max(double i1, double j1) {
        double ii;
        if (i1 >= j1) {
            ii = i1;
        } else {
            ii = j1;
        }
        return (ii);
    }
}
