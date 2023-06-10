package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/11 12:14 周四

@Description 
*/
public class Customer {
    private String firsName; // 名
    private String lastName; // 姓
    private Account account;

    public Customer(String f, String l, double b) {
        this.firsName = f;
        this.lastName = l;
    }

    public Customer(String f, String l) {
        this.firsName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
