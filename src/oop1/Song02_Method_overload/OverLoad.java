package oop1.Song02_Method_overload;

public class OverLoad {
    public static void main(String[] args) {
        OverLoad ol = new OverLoad();
        int[] stu = {1, 2, 4};

        // 方法重载
        ol.add(1, 1);
        ol.add(1.0, (double) 2);
        ol.add(stu);
        // 拼接字符串
        System.out.println(ol.concat("_", "Hello", "World"));
    }


    public int add(int i, int j) {
        return i;
    }

    public double add(double i, double j) {
        return i;
    }

    // 类型必须和传递进来的类型一致 int[]数组
    public void add(int[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public String concat(String operator, String... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            // 向字符串后面加分隔符 最后一次循环则多出分隔符
            // result = result + strs[i] + operator;
            if (i != 0) {
                // 向字符串前加分隔符 则更符合场景
                result += (operator + strs[i]);
            } else {
                result += strs[i];
            }
        }
        return result;
    }
}
