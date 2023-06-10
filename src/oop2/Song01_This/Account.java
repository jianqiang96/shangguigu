package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/11 12:07 周四

@Description 
*/
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return this.balance;
    }

    // 存钱
    public void deposit(double amt) {
        if (this.balance >= 0) {
            balance += amt;
            System.out.println("成功存入 " + amt);
        }
    }

    //
    public void withdraw(double amt) {
        if (this.balance >= amt) {
            this.balance -= amt;
            System.out.println("成功取出 " + amt);
        } else {
            System.out.println("取出失败 余额不足");
        }

    }
}
