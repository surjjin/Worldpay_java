
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Checkbox;

public class QueOne extends Frame{
    public static void main(String as[]){
        QueOne obj =new QueOne();
        obj.setSize(200, 300);
        obj.setVisible(true);
        
        GridLayout gl=new GridLayout(2,2);
        Panel p1 = new  Panel(gl);
        p1.setSize(200, 100);
        Label l1= new Label("Name");        
        Label l2=new Label("Age");
        TextField t1= new TextField("Enter name");
        TextField t2= new TextField("enter Age");
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        obj.add("North",p1);
        
        GridLayout gl1=new GridLayout(2, 3);
        Panel p2= new Panel(gl);
        p2.setSize(200, 100);
        Label l3=new Label("Sub");
        Checkbox c1= new Checkbox("JAVA");
        Checkbox c2= new Checkbox("C/C++");
        Label l4=new Label("Mode");
        Checkbox c3= new Checkbox("Online");
        Checkbox c4= new Checkbox("ON Campus");
        p2.add(l3);
        p2.add(c1);
        p2.add(c2);
        p2.add(l4);
        p2.add(c3);
        p2.add(c4);
        obj.add("Center",p2);
        
        
        Panel p3=new Panel();
        p1.setSize(100, 50);
        Button b1=new Button("save");
        Button b2=new Button("exit");
        Button b3=new Button("clear");
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        obj.add("South",p3);
        
    }
}
