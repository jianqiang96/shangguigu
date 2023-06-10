package oop1.Song05_Encapsulation;

/*
@User   jianqiang
@Create 2023/5/1 18:39 周一

@Description 
*/
public class Person {

    private int age;

    public void setAge(int inage) {
        if (inage >= 0 && inage <= 130) {
            age = inage;
        } else {
            System.out.println("请输入0-130 区间的值");
        }

//        for (int i = 0; i <= 130; i++) {
//            if (inage == i) {
//                age = inage;
//                break;
//            }
//            if (i == 130) {
//                System.out.println("请输入0-130 区间的值");
//            }
//        }
    }

    // 设置值  和 调用值 分开
    // 解耦合
    // 每个方法完成最简单的功能  使用再进行组合
    public int getAge() {
        return age;
    }
}

