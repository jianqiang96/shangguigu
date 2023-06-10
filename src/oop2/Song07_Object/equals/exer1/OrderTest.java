package oop2.Song07_Object.equals.exer1;

/*
@User   jianqiang
@Create 2023/6/6 22:55 周二

@Description 
*/
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(12, "wang");
        Order order2 = new Order(12, "wang");

        System.out.println(order1.equals(order2));
        System.out.println(order1.equals_test(order2));
    }
}
