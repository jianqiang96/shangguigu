package Basic;

import java.util.Scanner;

// import java.util.Scanner;

class array1 {
    public static void main(String[] args) {
        /*
         * int[] arr = { 8, 2, 1, 0, 3 };
         * int[] index;
         * index = new int[] { 2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3 };
         *
         * String tel = "";
         *
         * for (int i = 0; i < index.length; i++) {
         * int value = index[i];
         * tel += arr[value];
         * }
         * System.out.println(index.length);
         * System.out.println(tel);
         *
         */

        java.util.Scanner scan = new Scanner(System.in);
        System.out.print("学生人数： ");

        int count = scan.nextInt();
        int[] scores = new int[count];

        System.out.println("请输出 " + count + " 个同学的成绩");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }

        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分" + maxScore);

        int mixScore = 100;
        for (int i = 0; i < scores.length; i++) {
            if (mixScore > scores[i]) {
                mixScore = scores[i];
            }
        }
        System.out.println("最低分" + mixScore);

        int mumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            mumScore += scores[i];
        }
        System.out.println("最高最低差距" + (maxScore - mixScore));
        System.out.println("总计" + mumScore);
        scan.close();
    }
}