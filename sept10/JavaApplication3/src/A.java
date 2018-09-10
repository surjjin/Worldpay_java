
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj jain
 */
public class A implements ActionListener{
    TextField t1;
    TextField t2;

    public A(TextField t1, TextField t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
   
    public void copy(){
        t2.setText(t1.getText());
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       copy();
        //throw new UnsupportedOperationException("Not supported yet.");
       

    }
    
}
