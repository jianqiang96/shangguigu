package oop2.Song05_Super.exer3;

/*
@User   jianqiang
@Create 2023/5/28 12:38 周日

@Description 
*/

public class CheckAccount extends Account {
    // 可透支额度
    double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;

    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 重写父类取钱方法
     * 支持透支功能
     *
     * @param wi 取现金额 double类型
     */
    public void withdra(double wi) {
        if (wi < getBalance()) {
            // 余额足够的情况下直接调用父类的 取钱方法
            super.withdra(wi);
        } else if (wi > getBalance()) {
            // ca 需要透支的额度
            double ca = wi - getBalance();
            if (overdraft >= ca) {
                setBalance(0);
                overdraft -= ca;
                System.out.println("取款成功,透支额度剩余：" + overdraft + "  现金余额为:" + getBalance());
            } else if (overdraft < ca) {
                System.out.println("余额不足");
                System.out.println("透支额度剩余：" + overdraft + "  现金余额为:" + getBalance());
            }
        }
    }
}
