package exceptiondemo;

public class Demo1 {
    public static void main(String[] args) {
        /*
        异常的作用
            1.查询BUG关键信息
            2.可以作为方法内部的一种特殊返回值,以便通知调用者底层的执行情况
         */
        Student s1=new Student();
        s1.setAge(50);//抛出异常,调用处收到赋值失败
        //选择:自己悄悄处理or打印在控制台

    }

}
