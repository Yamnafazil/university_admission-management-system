/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem;

 //main file

import javax.swing.*;    
import java.awt.event.*; 
import java.io.FileWriter;
//abstract class
abstract class buttons{
    public JLabel l1;
    abstract void radio();
}
//inheritance
class variables extends buttons{

    @Override
    void radio() {
  l1 = new JLabel("Are you satisfied");
        l1.setBounds(1200,250,200,30); 
  

    }
    
    
}
class Universitymanagementsystem extends Components implements ActionListener{ 
   
JRadioButton rb8,rb9;    
JButton b;    
 JLabel l1;
Universitymanagementsystem(){   
     l1 = new JLabel("Are you satisfied");
        l1.setBounds(1200,250,200,30); 
  
rb8=new JRadioButton("YES");    
rb8.setBounds(1200,450,200,30);    
rb9=new JRadioButton("NO");    
rb9.setBounds(1200,350,200,30);
 
ButtonGroup bg=new ButtonGroup();    
bg.add(rb8);
bg.add(rb9);  
b=new JButton("click");    
b.setBounds(1200,550,200,30);    
b.addActionListener(this);    
add(l1);
add(rb8);
add(rb9);
add(b);    
setSize(300,300);    
setLayout(null);    
setVisible(true);   

    // rb8.setHorizontalTextPosition(SwingConstants.LEFT);

}    
public void actionPerformed(ActionEvent e){    
if(rb8.isSelected()){    
JOptionPane.showMessageDialog(this,"Thankyou for your response.");    

              
}    
if(rb9.isSelected()){    
JOptionPane.showMessageDialog(this,"we will try to fix your problem.");    
}    
}   

//main function
public static void main(String args[]){    
new Universitymanagementsystem();    
new variables();
//new suggestion();
}}   