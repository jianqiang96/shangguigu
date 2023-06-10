package oop1.Song03_Recursive_method;

public class Rabbit {
    public static void main(String[] args) {

    }

    // 斐波拉契数
    // 一对小兔一个月长成大兔
    // 一对大兔一个月生出一对小兔 并且此后每个月都生一对小兔，没有死亡
    public int getRabbitNumber(int month) {
        if (month == 1) {
            return 1;
        } else if (month == 2) {
            return 1;
        } else {
            return getRabbitNumber(month - 1) + getRabbitNumber(month - 2);
        }
    }
}
