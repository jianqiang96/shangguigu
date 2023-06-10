package oop1.Song01_Object_array;

public class StudentUtil {
    // 对象数组.md   元素中存储着 实例化后的对象的内存地址  同时可以用 数组加索引的方式调用对象
    // 创建数组  传入元素个数
    public Student[] createStudentArr(int num) {
        // 创建数组
        Student[] students = new Student[num];

        for (int i = 0; i < students.length; i++) {
            // new num个对象到数组中
            students[i] = new Student();

            // 给num个对象的属性赋值
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }
        return students;
    }

    // 打印指定年级学生的方法
    public void printStudents(Student[] students, int state1) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state1) {
                System.out.println(students[i].show());
            }
        }

    }

    // 打印学生列表
    public void printStudentList(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());

        }
    }


    // 按成绩排列    冒泡排序
    // 判断的是数组元素中对象的属性
    // 交换的是数组元素的地址
    public  Student[]  bubbleSort(Student[] students){
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                // 左侧 大于  右侧 值则交换
                if (students[j].score > students[j + 1].score) {
                    // 临时交换变量 Student类型的tmp变量
                    Student tmp = students[j];
                    // 较大的值向右侧移动
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;

                }
            }
        }
        return students;
    }
}
