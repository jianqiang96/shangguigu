MVC是一种软件构建模式，为了降低程序开发中的代码业务的耦合度
    
MVC设计将程序分为3个层次
这将程序输入输出、数据处理、数据展示分离开的设计模式使程序结构变得灵活清晰
同时也描述了程序各个对象间的通信方式，降低了程序的耦合性

    视图模型层   Viewer
        为用户提供使用界面，与用户直接进行交互
            view.utils

    控制器层     Controller
        解析用户请求处理业务逻辑，给予用户响应

    数据模型层    Model
        主要承载数据  处理数据
