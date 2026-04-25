package exceptiondemo;

public class Demo6 {
    public static void main(String[] args) {
        /*
        更专业的异常处理方式
             public String getMessage()      返回此 throwable 的详细消息字符串
             public String toString()        返回此可抛出的简短描述
      最常用  public void printStackTrace()   把异常的错误信息输出在控制台
         */
        int[] arr = {1, 2, 3, 4, 5, 6};


        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            /*String message = e.getMessage();
            System.out.println(message);
            Index 10 out of bounds for length 6*/

            //System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

            e.printStackTrace();//红色字体异常,但不会结束运行
            /*
            java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
	            at exceptiondemo.Demo6.main(Demo6.java:15)
             */
        }

        System.out.println("看看我执行了吗? ");

        System.err.println(123);//用来打印错误信息的输出语句,是红色的,别乱用,了解就行
    }
}
