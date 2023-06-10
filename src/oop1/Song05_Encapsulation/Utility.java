package oop1.Song05_Encapsulation;

import java.util.Scanner;

/*
@User   jianqiang
@Create 2023/5/1 17:39 周一

@Description 
*/
public class Utility {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(scan.hasNext());
        System.out.println(scan.nextLine());
    }

    // 限制输入内容
    // 只接受1-4 的数字
    public static char readMenuSelection() {
        char c;
        // 死循环
        for (; ; ) {
            // 调用方法 只允许输入一位
            String str = readKeyBoard(1);
            // 返回特定索引的值
            c = str.charAt(0);
            // 只允许 1-4
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.println("选择错误重新输入");
            } else {
                break;
            }
        }
        return c;
    }

    //用于收入和支出金额的输入。该方法从键盘读取一个不超过指定长度的整数，并将其作为方法的返回值。
    public static int readNumber(int limit) {
        int c;
        for (; ; ) {
            String str = readKeyBoard(limit);
            try {
                c = Integer.parseInt(str);
                break;  // 转换成功跳出循环
            } catch (NumberFormatException e){
                System.out.println("请输入长度为"+limit+" 的值 ");
            }
        }
        // 返回值  结束方法
        return c;
    }

    // 当前类内部使用   限制输入长度   不保证为数字类型
    private static String readKeyBoard(int limit) {
        String line = "";
        // 判断是否为空值  不为空返回 true
        while (scan.hasNext()) {
            // 获取输入内容
            line = scan.nextLine();
            // 长度不得为0  长度不得大于实参
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度不得大于" + limit + " 请重新输入 ");
                continue;
            }
            break;
        }
        return line;

    }
}
