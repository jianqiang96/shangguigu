使用this修饰的变量  表示的是属性（成员变量） 


当前对象（在方法中调用时）  
当前正在创建的对象（在构造器中调用时）


在非static类型的方法内的使用this
    我们在成员变量（属性）和其他方法前使用this，表示当前属性或方法所属对象
    一般情况下可以省略 this 结构
    如果方法的形参与对象的属性同名，必须使用this修饰属性，进行区分

在构造器内使用this
    通过构造器创建对象，可以再构造器内调用正在创建的对象属性或方法
    使用this表示当前属性或方法所属对象
    一般可以省略
    形参同名属性，使用this区分

this 调用构造器
    this();
    调用当前类的构造器中指定的其他构造器
    必须声明在当前构造器的首行