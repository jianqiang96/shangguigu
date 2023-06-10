package oop2.Song05_Super.exer5;

/*
@User   jianqiang
@Create 2023/5/28 20:53 周日

@Description 
*/
public class Son extends Father {
    private String info = "尚";

    public void test() {
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
