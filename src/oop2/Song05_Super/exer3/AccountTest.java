package oop2.Song05_Super.exer3;

/*
@User   jianqiang
@Create 2023/5/28 12:33 周日

@Description 
*/
public class AccountTest {
    public static void main(String[] args) {
        CheckAccount account = new CheckAccount(1122, 20000, 4.5,5000);
        account.withdra(30000);
        account.withdra(2500);
        account.deposit(3000);
        account.withdra(21000);
        account.withdra(10000);
    }
}
