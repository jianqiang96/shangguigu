package oop2.Song02_project01;


/*
@User   jianqiang
@Create 2023/5/14 2:03 周日

@Description 
*/
public class ManagingUsers {
    // 存储 Custom 类对象 地址
    private Custom[] csl = new Custom[10];
    // 记录用户数量
    private int userIndex;

    // 生成新的 Custom类  修改成员变量后 放入到 csl 数组中
    public void addCustomer() {

        Custom cs = new Custom();
        // 修改对象类成员变量
        cs.addUser();
        // 将对象类 插入到数组变量中
        csl[userIndex++] = cs;
    }

    public void delUser() {


    }

    // 修改指定用户名 的 Custom类  中的成员变量
    public void modifyUser(String name) {
        for (int i = 0; i < userIndex; i++) {
            if (csl[i].userName().equals(name)) {
                csl[i].modifyUser();
                break;
            }
        }


    }

    // 输出所有用户信息
    public void viewUsers() {
        for (int i = 0; i < userIndex; i++) {
            System.out.println(csl[i]);
            csl[i].viewUser();

        }
    }

}
