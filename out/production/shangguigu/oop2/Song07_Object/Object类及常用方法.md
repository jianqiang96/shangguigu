## Object类

    任何一个Java类都直接或间接继承于Object类
    称为java类的根父类
    Object中声明的的结构具有通用性
        object中没有声明属性
        object类提供了一个空参的构造器

### 常用方法

```
    equals()
        在方法没有重写的情况下，调用的就是Object类中声明的equals()
        比较两个对象的引用地址是否一致 是否指向2堆空间中的同一个对象实体
        
        对于String File Date和包装类 他们都重写了Object类中的equals方法 用于比较两个对象的实体内容是否一致
        
        实际开发中 针对自定义的类 常常会判断两个对象是否一致
        主要是判断两个对象的属性值是否相等
        所以要重写Object类的equals()
            IDEA自动实现
        区分 == 和 equals()
            == 运算符
                基本数据类型 判断数值是否相等
                引用数据类型 比较两个引用变量的地址值是否相等
            equals()
                只能使用在引用数据类型

```

```
toString()
    Object
        getClass().getName() + "@" + Integer.toHexString(hashCode());
    Sting
            public String toString() {
                return this;
            }
    File
            public String toString() {
                return getPath();
            }  
    Date
            

    自定义的类 在没有重写Object类的toString方法 默认返回当前对象的地址值
    String File Date或包装类等子类都重写了toString()
        在调用toString时 返回当前对象的实体内容
    
    开发中对于自定义的类在调用toString()时，也希望显示其对象的实体内容，而非地址值
    重写Object类中toString
    

```

        