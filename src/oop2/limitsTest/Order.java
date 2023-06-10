package oop2.limitsTest;

/*
@User   jianqiang
@Create 2023/5/25 18:13 周四

@Description 
*/
public class Order {
    private int orderPrivate; // 私有 本类内部
    int orderDefault;          // 缺省 本包内部
    protected int orderProtected; // 其他包子类
    public int orderPublic;     // 其他包非子类


    private int getOrderPrivate() {
        return orderPrivate;
    }

    int getOrderDefault() {
        return orderDefault;
    }

    protected int getOrderProtected() {
        return orderProtected;
    }

    public int getOrderPublic() {
        return orderPublic;
    }
}