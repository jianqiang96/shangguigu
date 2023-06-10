package oop2.Song01_This;

/*
@User   jianqiang
@Create 2023/5/3 22:52 周三

@Description 
*/
public class BoyTest {
    public static void main(String[] args) {

        Boy boy = new Boy("杰克", 22);
        Girl girl = new Girl("露丝", 20);

        // 将Boy对象整体（成员变量、方法）传递给 Girl 对象的 marry 方法
        girl.marry(boy);

        boy.shout();


    }
}
