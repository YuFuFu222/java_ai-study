import javax.swing.*;

public class Poker extends JLabel {

    private String name;//牌名
    private boolean up;//牌显示正面还是反面
    private boolean canClick=false;//是否可悲点击
    private boolean clicked=false;//是否已经被点击

    public Poker(String name,boolean up){
        this.name=name;
        this.up=up;
        if(this.up){
            //显示正面
        }else {
            //显示反面
        }


    }
}
