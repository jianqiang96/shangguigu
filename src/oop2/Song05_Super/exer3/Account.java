package oop2.Song05_Super.exer3;

/*
@User   jianqiang
@Create 2023/5/28 12:09 周日

@Description 
*/
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 通过年利率 计算月利率并返回
     *
     * @return
     */
    public double getMonthlyInterest() {
        /*
        年利率=月利率×12（月）=日利率×365（天）；
        月利率=年利率÷12（月）=日利率×30（天）；
        日利率=年利率÷365（天）=月利率÷30（天）*/
        double MonthlyInterest;
        MonthlyInterest = annualInterestRate / 12;
        return MonthlyInterest;
    }

    /**
     * 取钱
     *
     * @param wi
     */
    public void withdra(double wi) {
        if (balance == 0 || balance < wi) {
            System.out.println("余额不足 余额为：" + balance);
        } else if (balance > wi) {
            balance -= wi;
            System.out.println("取款成功 余额为：" + balance);
        }
    }

    /**
     * 存钱
     *
     * @param de
     */
    public void deposit(double de) {
        balance += de;
        System.out.println("存款成功 余额为：" + balance);
        System.out.println("月利率为：" + getMonthlyInterest() + "%");
    }
}
