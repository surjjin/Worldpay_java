import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class PlayGame{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.print("value of x :");
        int x=sc.nextInt();
        System.out.print("value of y :");
        int y=sc.nextInt();
        System.out.print("value of z :");
        int z=sc.nextInt();

        System.out.println("enter choice");
        int ch=sc.nextInt();
        ThreeDimensionGame g=null;
        switch(ch)
        {
            case 1:
                g=new ThreeDimensionGame();
                break;
            case 2:
            {
                FileInputStream fin =new FileInputStream("game.txt");
                ObjectInputStream oin =new ObjectInputStream(fin);
                g =(ThreeDimensionGame)oin.readObject();
                g.show();
                oin.close();
                fin.close();
            }    
        }
        //g.show();
        g.xMove(x);
        g.yMove(y);
        g.zMove(z);
        g.show();

        FileOutputStream fout=new FileOutputStream("game.txt");
        ObjectOutputStream oot=new ObjectOutputStream(fout);
        oot.writeObject(g);
        oot.close();
        fout.close();
    }
}