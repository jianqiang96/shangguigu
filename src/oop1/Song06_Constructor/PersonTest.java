package oop1.Song06_Constructor;

/*
@User   jianqiang
@Create 2023/5/1 22:30 周一

@Description 
*/
public class PersonTest {
    public static void main(String[] args) {
        Person ps = new Person();
        Person ps1 = new Person(4);

        // 构造器在创建对象的同时 给对象的相关属性赋值
        Student sd = new Student("刘强东", 48, "中国人民大学", "社会学");
        System.out.println(sd.getInfo());

        // 初始化
        Account at = new Account();
        Customer cr = new Customer("Jane", "Smith");
        cr.setAccount("1000");
        at.setId(cr.getAccount());
        at.setBalance(cr.getAccount(), 2000);
        at.setAnnualInterestRate(cr.getAccount(), 1.23);

        // 初始情况
        System.out.println("姓名" + cr.getFirstName() + " " + cr.getLastName() +
                " 账号 " + cr.getAccount() + " 余额 " + at.getBalance(cr.getAccount()) +
                " 年利率" + at.getAnnualInterestRate(cr.getAccount()) + "%");

        // 操作
        at.deposit(cr.getAccount(), 100);
        at.withdraw(cr.getAccount(), 960);
        at.withdraw(cr.getAccount(), 2000);
        System.out.println("姓名" + cr.getFirstName() + " " + cr.getLastName() +
                " 账号 " + cr.getAccount() + " 余额 " + at.getBalance(cr.getAccount()) +
                " 年利率" + at.getAnnualInterestRate(cr.getAccount()) + "%");

        // 匿名对象
        // 没有名字的对象
        // 只能使用一次
        new Account("1001", 2000, 1.23).withdraw("1001",2000);
    }
}
