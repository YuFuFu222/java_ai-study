package exceptiondemo;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        /*
        需求:
                键盘录入自己心仪的女朋友姓名和年龄。
                姓名的长度在3-10之间，
                年龄的范围为18-40岁，
                超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。
        提示:
                需要考虑用户在键盘录入时的所有情况。
                比如: 录入年龄时超出范围，录入年龄时录入了abc等情况

      抛出
        告诉调用者出错了
      捕获
        不让程序停止
         */
        Scanner sc=new Scanner(System.in);

        GF gf=new GF();


        while (true) {
            try {
                System.out.println("请输入名字");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("请输入年龄");
                String ageStr = sc.nextLine();
                int age=Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
                //如果所有数据正确,就跳出循环
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误");
                //continue
            } catch (RuntimeException e) {
                System.out.println("姓名长度或年龄范围有误");
                //continue
            }
        }


        System.out.println(gf);

    }
}
