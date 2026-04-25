package exceptiondemo;

public class Demo5 {
    public static void main(String[] args) {
        /*
        如果try中遇到了问题,那么try下面的代码还会执行吗?
            不会,直接跳catch
            如果没catch,就交给JVM虚拟机处理
         */
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
            System.out.println("看看我执行了吗？...try");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println("看看我执行了吗？");
    }
}
