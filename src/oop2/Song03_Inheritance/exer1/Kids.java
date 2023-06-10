package oop2.Song03_Inheritance.exer1;

/*
@User   jianqiang
@Create 2023/5/25 17:06 周四

@Description 
*/
public class Kids extends ManKind {
    private int yearsOld;

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld);
    }

    // 方法重写
    public void employeed() {
        System.out.println("kids should study and no job.");
    }
}
