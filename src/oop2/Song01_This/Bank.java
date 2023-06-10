package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/11 12:59 周四

@Description 
*/
public class Bank {
    private Customer[] customers; // 用于保存多个客户
    private int numberOfCustomer; // 用于记录客户个数

    public Bank() {
        // 初始化数组
        customers = new Customer[10];
    }

    /**
     * 将指定的姓名的客户保存在客户列表中
     *
     * @param f
     * @param l
     */
    public void addCustomer(String f, String l) {
        // 将变量传递到 构造器
        Customer cust = new Customer(f, l);
        // 将对象类 插入到数组变量中
        customers[numberOfCustomer++] = cust;

        // customers[numberOfCustomer] = cust;
        // numberOfCustomer++;
    }

    /**
     * 获取客户的个数
     *
     * @return
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 获取指定索引位置上的客户
     *
     * @param index
     * @return
     */
    public Customer getCustome(int index) {
        if (index < 0 || index >= numberOfCustomer) {
            return null;
        }
        // 返回  Customer cust = new Customer(f, l);  类对象
        return customers[index];
    }
}
