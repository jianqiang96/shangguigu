package oop1.Song06_Constructor;

/*
@User   jianqiang
@Create 2023/5/1 23:23 周一

@Description 
*/
public class Customer {
    // 封装性
    private String firstName;
    private String lastName;
    private String account;

    Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(String a) {
        account = a;
    }

    public String getAccount() {
        return account;
    }
}
