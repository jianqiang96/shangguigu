package oop2.Song07_Object.equals.apply;

/*
@User   jianqiang
@Create 2023/6/6 16:51 周二

@Description 
*/
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("tom", 18, new Account(2000));
        Customer customer2 = new Customer("tom", 18, new Account(2000));

        /**
         * Customer类需要重写equals()之外，其内部的类类型的属性所在类，也需要重写equals()
         */
        System.out.println(customer1.equals(customer2));
    }
}
