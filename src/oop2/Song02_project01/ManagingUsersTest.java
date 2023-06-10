package oop2.Song02_project01;

import java.util.Scanner;

/*
@User   jianqiang
@Create 2023/5/15 11:18 周一

@Description 
*/
public class ManagingUsersTest {
    public static void main(String[] args) {
        ManagingUsers mu = new ManagingUsers();
        Scanner sc = new Scanner(System.in);

        System.out.println("1、添加 2、修改 3、删除 4、用户列表  5、提示 6、退出");
        for (; ; ) {
            String index1 = sc.next();
            if (index1.equals("1")) {
                mu.addCustomer();
                System.out.println();
                System.out.println("1、添加 2、修改 3、删除 4、用户列表  5、提示 6、退出");
            } else if (index1.equals("2")) {
                System.out.println("请输入用户姓名: ");
                String name = sc.next();
                mu.modifyUser(name);
                System.out.println();
                System.out.println("1、添加 2、修改 3、删除 4、用户列表  5、提示 6、退出");
            } else if (index1.equals("3")) {
                mu.delUser();
            } else if (index1.equals("4")) {
                mu.viewUsers();
                System.out.println();
                System.out.println("1、添加 2、修改 3、删除 4、用户列表  5、提示 6、退出");
            } else if (index1.equals("5")) {
                System.out.println("1、添加 2、修改 3、删除 4、用户列表  5、提示 6、退出");
            } else {
                break;
            }
        }
    }
}