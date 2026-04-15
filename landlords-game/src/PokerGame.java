import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //准备牌
    //静态代码块:随着类加载,只执行一次

    //牌盒
    static ArrayList<Integer> list=new ArrayList<>();
    static HashMap<Integer,String > hm=new HashMap<>();

    static {
        String[] color={"♦","♠","♣","♥"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int serialNumber=1;//序号
        for (String n:number){
            for(String c:color){
                list.add(serialNumber);
                hm.put(serialNumber,c+n);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);

    }

    public PokerGame(){


        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> lord = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            //i:依次表索引
            int serialNumber= list.get(i);//牌的序号
            if(i<=2){
                lord.add(serialNumber);
                continue;
            }
            if(i%3==0){
                player1.add(serialNumber);
            } else if (i%3==1) {
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }
        }


        //看牌
        lookPoker("底牌",lord);
        lookPoker("钢脑壳",player1);
        lookPoker("蛋筒",player2);
        lookPoker("我",player3);

    }
    //名字+牌
    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.print(name+": ");
        for (int serialNumber : ts) {
            System.out.print(hm.get(serialNumber)+" ");
        }
        System.out.println();
    }


}
