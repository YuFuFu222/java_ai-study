import java.util.*;

public class PokerGame2 {
    //准备牌
    //静态代码块:随着类加载,只执行一次

    //牌盒
    static ArrayList<String> list=new ArrayList<>();
    //牌的价值
    static HashMap<String,Integer > hm=new HashMap<>();

    static {
        String[] color={"♦","♠","♣","♥"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (String n:number){
            for(String c:color){
                list.add(c+n);

            }
        }
        list.add("大王");
        list.add("小王");
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",16);
        hm.put("大王",17);
    }

    public PokerGame2(){


        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lord    = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //i:依次表索引
            String poker=list.get(i);//牌的序号
            if(i<=2){
                lord.add(poker);
                continue;
            }
            if(i%3==0){
                player1.add(poker);
            } else if (i%3==1) {
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌",lord);
        lookPoker("钢脑壳",player1);
        lookPoker("蛋筒",player2);
        lookPoker("我",player3);

    }
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               /* o1:要插入的牌
               o2:已在有序序列的牌
               负数:o1小,插前面
               正数:o1大,插后面
               0:比花色
               */
                String color1 = o1.substring(0,1);
                int value1=getValue(o1);

                String color2 = o2.substring(0,1);
                int value2=getValue(o2);

                int i=value1-value2;
                return i==0?color1.compareTo(color2):i;
            }
        });
    }

    //名字+牌
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+": ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
    public int getValue(String poker){
        String num=poker.substring(1);//获取牌数字
        if(num.equals("王")){
            num=poker;
        }//或者让list.add(" 大王"),注意空格,小王同理
        if(hm.containsKey(num)){
            return hm.get(num);
        }else {
            return Integer.parseInt(num);
        }
    }

}
