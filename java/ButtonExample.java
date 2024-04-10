import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf1=new JTextField();  
	final JTextField tf2=new JTextField();
	final JTextField tf3=new JTextField();  
    tf1.setBounds(50,50, 150,20);  

tf2.setBounds(50,100, 150,20);  
tf3.setBounds(50,150, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,200,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){ 
            int n1= Integer.parseInt(tf1.getText());

	    int n2= Integer.parseInt(tf2.getText());
	    int n3=n1+n2;

            tf3.setText(""+n3);  
        }  
    });  
    f.add(b);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  