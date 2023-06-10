package oop1.Song05_Encapsulation;

/*
@User   jianqiang
@Create 2023/4/30 20:16 周日

@Description 
*/
public class AnimalTest {
    public static void main(String[] args) {
        Anumal at = new Anumal();

        at.setLegs(6);
        at.setLegs(-1);

        Utility ut = new Utility();
//        System.out.println(ut.readMenuSelection());
//        System.out.println(ut.readNumber(2));

        Person ps = new Person();
        ps.setAge(150);
        ps.setAge(ut.readNumber(3));  // 只接收3位以内的值
        System.out.println(ps.getAge());
    }
}

// 声明一个类
class Anumal {
    // 属性
    public String name;
    private int legs;

    // 通过方法限制对属性的调用
    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            System.out.println("输入的值不合法");
        }
    }

    public int get() {
        return legs;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}