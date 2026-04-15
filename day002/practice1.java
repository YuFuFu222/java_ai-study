import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class practice1 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        //点名器1:随机点名
        Random r =new Random();
        int index= r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);
        Collections.shuffle(list);
        System.out.println(list.get(0));
        //点名2:70%男生,30%女生
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list2);
        Random r2=new Random();
        int num= r2.nextInt();list2.size();
        if(num==1){
            //boyList
        }else {
            //girlList
        }
        //点名3:不重复,点完刷新
        ArrayList<String> list3=new ArrayList<>();
        Collections.addAll(list3,"111","222","333","444","555");
        Collections.shuffle(list3);
        int i3=0;
        while(i3< list3.size()){
            System.out.println(list3.get(i3));
            i3++;
        }
        i3=0;
        Collections.shuffle(list3);
        while(i3< list3.size()){
            System.out.println(list3.get(i3));
            i3++;
        }
    }
}
