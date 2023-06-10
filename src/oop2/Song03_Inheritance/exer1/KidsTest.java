package oop2.Song03_Inheritance.exer1;

/*
@User   jianqiang
@Create 2023/5/25 17:13 周四

@Description 
*/
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids();

        kids.setSalary(1);
        kids.setSex(1);
        kids.setYearsOld(1);

        kids.employeed();
        kids.printAge();
        kids.manOrWoman();
    }
}
