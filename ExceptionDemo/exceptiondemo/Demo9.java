package exceptiondemo;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GF gf=new GF();
/*
        自定义异常
            意义:为了让报错信息更加见名知意
 */
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
                e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            }catch (AgeOutOfBoundsException e){
                e.printStackTrace();
            }
        }


        System.out.println(gf);
    }
}
