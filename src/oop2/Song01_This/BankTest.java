package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/12 18:40 周五

@Description 
*/
public class BankTest {
    public static void main(String[] args) {
        // 实例化 bank类 构造器生成数组
        Bank bank = new Bank();

        // Customer 类实例化 并修改其成员变量
        // 将新创建的实例 地址 插入到Bank的数组变量中
        bank.addCustomer("建强", "王");

        // Customer 类实例化 并修改其成员变量
        // 将新创建的实例 地址 插入到Bank的数组变量中
        bank.addCustomer("建", "王");

        // BanK类中 getCustome 方法返回指定 index 数组变量中的 实例地址
        // Customer 类 setAccount方法 将新创建的 类Account实例 存入Customer成员变量中
        // bank.addCostomer 方法创建的时候创建的Customer 类实例
        // new Account 创建实例  构造器将存入  余额
        bank.getCustome(0).setAccount(new Account(100));

        // bank.getCustome方法返回  Customer cust = new Customer(f, l);  类对象的地址
        // Customer 类的 getAccount 返回 new Account(100) 时 创建的对象地址
        // Account 类的 withdraw方法 修改了 balance 成员变量
        bank.getCustome(0).getAccount().withdraw(50);

        // BanK类中 getCustome 方法返回指定 index 数组变量中的 实例地址
        // Customer 类的 getAccount 返回 new Account(100) 时 创建的对象地址
        // Account 类的 getBalance方法返回了  balance double类型变量的值
        System.out.println(bank.getCustome(0).getAccount().getBalance());


        bank.getCustome(1).setAccount(new Account(100));
        System.out.println(bank.getCustome(1).getAccount().getBalance());
    }
}
