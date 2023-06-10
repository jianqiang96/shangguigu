package oop2.Song02_project01;

import java.util.Scanner;

/*
@User   jianqiang
@Create 2023/5/14 1:57 周日

@Description 存储单个用户
*/
public class Custom {

    public Custom() {
    }


    Scanner sc = new Scanner(System.in);
    // 保存中文名称
    private String[] list1 = new String[]{"姓名", "性别", "年龄", "电话号码", "邮件地址"};
    // 保存用户数据
    private String[] list2 = new String[5];


    public void addUser() {
        System.out.println("------- 添加新用户 ------    ");
        for (int i = 0; i < list1.length; i++) {
            System.out.println("请输入" + list1[i] + " :    ");
            String name1 = sc.next();
            if (name1 != null) {
                list2[i] = name1;
            }
        }
        System.out.println("------- 添加完成 ------    ");
    }

    public void modifyUser() {
        System.out.println("------- 修改新用户 ------    ");
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入" + list1[i] + "(" + list2[i] + ") :    ");
            String name1 = sc.next();
            if (name1 != null) {
                list2[i] = name1;
            }
        }
        System.out.println("------- 修改完成 ------    ");
    }

    // 输入用户全部信息
    public void viewUser() {
        System.out.println("姓名 " + list2[0] + "  性别" + list2[1] + "  年龄" + list2[2] + "  电话号码" + list2[3] + "  邮件地址" + list2[4]);
    }

    // 返回用户姓名
    public String userName() {
        return list2[0];

    }

}
