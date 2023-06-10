package oop1.Song01_Object_array;

public class StudentTest {
    public static void main(String[] args) {
        StudentUtil util = new StudentUtil();
        // 创建数组并赋值
        Student[] students = util.createStudentArr(10);

        // 用工具类打印对象属性state为3的
        util.printStudents(students, 3);

        System.out.println("************************************************");
        //                 ----------------------------------------------------------------

        // 按成绩排列    冒泡排序
        // 判断的是数组元素中对象的属性
        // 交换的是数组元素的地址
        util.bubbleSort(students);
        // for (int i = 0; i < students.length; i++) {
        util.printStudentList(students);

    }
}
