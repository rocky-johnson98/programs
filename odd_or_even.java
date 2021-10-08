import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class odd_or_even {
    JFrame j;
    odd_or_even(){
        j = new JFrame("Odd or Even");
        
        //taking number from user
        JLabel jl = new JLabel("Enter a number : ");
        jl.setBounds(50,50,150,30);
        JTextField jt = new JTextField();
        jt.setBounds(150,50,140,30);
        
        //x-axis,y-axis,width,height
        
        //adding button to check either number is odd or even
        JButton jb = new JButton("Check");
        jb.setBounds(150,100,70,30);
        
        //for result after clicking on button
        JLabel jr = new JLabel("Result : ");
        jr.setBounds(50,150,150,30);
        JTextField jres = new JTextField();
        jres.setBounds(150,150,140,30);
        
        jb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int num = Integer.parseInt(jt.getText());
            if(num%2==0){
                jres.setText("Even");
            }else{
                jres.setText("Odd");
            }
        }
        });
        
        j.add(jt); j.add(jl); j.add(jb); j.add(jr); j.add(jres);
        j.setSize(380,300);
        j.setLayout(null);
        j.setVisible(true);
    }
    public static void main(String[] args) {
        new odd_or_even();
    }
}
