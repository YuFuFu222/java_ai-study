package exceptiondemo;

public class Demo4 {
    public static void main(String[] args) {
        /*
        如果try中遇到的问题没有被捕获,怎么执行?
            相当于try...catch白写了,交给JVM虚拟机默认处理(显示异常并终止运行)
         */
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException

        }catch (ArithmeticException e){
            System.out.println("算术异常");
        }

        System.out.println("看看我执行了吗？");
    }
}
