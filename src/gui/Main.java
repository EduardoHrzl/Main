 
package GUI;

import java.awt.Color;
import javax.swing.JFrame;


 
public class Main {

    
    public static void main(String[] args) { 
       
        JFrame frame= new JFrame(); 
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        
        frame.setResizable(true);
        //formato default
       // frame.getContentPane().setBackground(Color.BLUE); 
        
        
        //formato RGB
        //frame.getContentPane().setBackground Color(28,26,198);
        
        //FORMATO HEXADECIMAL:
        frame.getContentPane().setBackground( new Color(0x1AC3C6));  

       
        
        
    }
    
}
