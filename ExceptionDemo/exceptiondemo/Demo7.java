package exceptiondemo;

public class Demo7 {
    public static void main(String[] args) {
        /*
        throws: 写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常。
        throw : 写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。

        需求:
            定义一个方法求数组的最大值
        */

        int[] arr = null;
        try {
            int max=getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
            throw new NullPointerException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println();

    }
    public static int getMax(int[] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException*/{
        //手动创建异常
        if (arr==null){
            throw new NullPointerException();
        }
        //触发异常后下面代码不执行
        System.out.println("看看我执行了吗");
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
