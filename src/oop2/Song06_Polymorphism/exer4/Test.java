package oop2.Song06_Polymorphism.exer4;

/*
@User   jianqiang
@Create 2023/5/31 0:08 周三

@Description 
*/
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.meeting(new Man(), new Woman());

        test.meeting(new Woman());
    }

    /**
     * 传入数组对象   类型为Person
     *
     * @param ps
     */
    public void meeting(Person... ps) {

        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();

            if (ps[i] instanceof Man) {
                Man man = (Man) ps[i];  // 强转
                man.smoke();
            }
            //   } else if (ps[i] instanceof Woman woman) { // jdk17
            else if (ps[i] instanceof Woman) {
                Woman woman = (Woman) ps[i];
                woman.makeup();
            }
        }
        System.out.println();

    }


}

