package oop1.Song06_Constructor;

/*
@User   jianqiang
@Create 2023/5/1 23:08 周一

@Description 
*/
class Student {
    String name;
    int age;
    String school;
    String major;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo() {

        return "姓名 " + name + " 年纪 " + age + " 学校 " + school + " 专业 " + major;
    }
}
