package Basic;
import java.util.Scanner;

class ifElse5 {
    public static void main(String[] arge) {
        int heart = 89;
        String result1;

        if (heart >= 60) {
            result1 = "正常";
        } else {
            result1 = "异常";
        }
        System.out.println(result1);

        int num = 13;

        if (num % 2 == 0) {
            System.out.println("整数");
        } else {
            System.out.println("非整数");
        }

        int result2 = (int) (Math.random() * 101);

        String reward;
        if (result2 == 100) {
            reward = "跑车";
        } else if (result2 >= 80) {
            reward = "自行车";
        } else if (result2 >= 60) {
            reward = "一日游";
        } else {
            reward = "胖揍";
        }
        System.out.println(reward);

        java.util.Scanner scan1 = new Scanner(System.in);
        System.out.print("请输入姓名:  ");
        String name = scan1.next();
        System.out.println();
        System.out.println(name);
        scan1.close();
    }
}