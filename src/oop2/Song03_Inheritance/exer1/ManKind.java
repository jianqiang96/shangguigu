package oop2.Song03_Inheritance.exer1;

/*
@User   jianqiang
@Create 2023/5/25 16:58 周四

@Description 
*/
public class ManKind {
    private int sex;
    private int salary;


    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else if (salary != 0) {
            System.out.println("job");
        }
    }
}
