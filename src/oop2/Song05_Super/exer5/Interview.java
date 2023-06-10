package oop2.Song05_Super.exer5;

/*
@User   jianqiang
@Create 2023/5/28 20:55 周日

@Description 
*/
public class Interview {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();

        s.setInfo("大");
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
    }
}
