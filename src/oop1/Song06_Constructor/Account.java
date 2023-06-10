package oop1.Song06_Constructor;

/*
@User   jianqiang
@Create 2023/5/1 23:23 周一

@Description 
*/
public class Account {
    private String id; // 账号
    private double balance; // 余额
    private double annualInterestRate; // 年利率

    // 构造器
    public Account() {
    }

    public Account(String i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    // 访问器方法  getter
    double getBalance(String i) {
        if (id.equals(i)) {
            return balance;
        } else
            System.out.println("无此账号  重新输入账号");
        return 0;
    }

    double getAnnualInterestRate(String i) {
        if (id.equals(i)) {
            return annualInterestRate;
        } else
            System.out.println("无此账号  重新输入账号");
        return 0;
    }

    void setId(String i) {
        id = i;
    }

    // 访问器方法  setter
    void setBalance(String i, double b) {
        if (id.equals(i)) {
            balance = b;
        } else
            System.out.println();
        System.out.println("无此账号  重新输入账号");
    }

    void setAnnualInterestRate(String i, double a) {
        if (id.equals(i)) {
            annualInterestRate = a;
        } else
            System.out.println();
        System.out.println("无此账号  重新输入账号");
    }

    //  取款方法  withdraw
    void withdraw(String i, double w) {
        if (id.equals(i)) {
            if (w <= balance) {
                balance -= w;
                System.out.println();
                System.out.println("成功取出 " + w + " \n 现余额为 " + balance);
            } else
                System.out.println("余额不足 现余额为 " + balance);

        } else
            System.out.println("无此账号  重新输入账号");

    }

    //  存款方法  deposit
    void deposit(String i, double d) {
        if (id.equals(i)) {
            balance += d;
            System.out.println();
            System.out.println("成功存入 " + d + " \n 现余额为 " + balance);
        } else
            System.out.println("无此账号  重新输入账号");
    }
}
