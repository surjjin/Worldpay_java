import java.io.Serializable;

public class Game implements Serializable{
    private int x;
    private int y;

    public void xMove(int pts){
        x=x+pts;
    } 
    public void yMove(int pts){
        y=y+pts;
    }
    public void show(){
        System.out.print("the value of x: "+x+" the value of y: "+y);
    }
}