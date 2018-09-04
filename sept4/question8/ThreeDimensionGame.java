import java.io.Serializable;

public class ThreeDimensionGame extends Game implements Serializable{
    private int z;
    public void zMove(int ptr){
        z=z+ptr;
    }    
    public void show(){
        super.show();
        System.out.println("the value of z: "+z);
    }
}