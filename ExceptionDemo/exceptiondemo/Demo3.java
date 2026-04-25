package exceptiondemo;

public class Demo3 {
    public static void main(String[] args) {
        /*
        如果try中可能遇到多个问题,怎么处理
            写多个catch与之对应
                如果捕获多个异常,且有父子关系,父类要写在下面
            catch从上往下执行,一旦catch即跳过try
         */
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
            System.out.println(2/3);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }catch (ArithmeticException e){
            System.out.println("算术异常");
        }

        System.out.println("看看我执行了吗？");
    }
}
