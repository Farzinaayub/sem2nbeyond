import java.awt.*;
import java.awt.event.*;
public class Calculator {
    public static void main(String[] args){
        Main obj = new Main();
        obj.setVisible(true);
    }
}
class Main extends Frame implements ActionListener{
    Label l1,l2,l3;
    Button b1,b2,b3,b4; 
    TextField t1,t2,t3;
    Main(){
        l1=new Label("first number:");
        l2=new Label("second number:");
        l3=new Label("result:");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);

        b1=new Button("+");
        b2=new Button("-");
        b3=new Button("*");
        b4=new Button("/");

        setLayout(new FlowLayout());
        setBackground(Color.magenta);
        b1.setBackground(Color.ORANGE);
        b2.setBackground(Color.CYAN);
        b3.setBackground(Color.PINK);
        b4.setBackground(Color.DARK_GRAY);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(200,300);
    }

    public void actionPerformed(ActionEvent ae){
        int n1,n2;

        if(ae.getSource()==b1){
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            int s=n1+n2;
            t3.setText("The sum is:"+s);
            
        }

        if(ae.getSource()==b2){
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            int d = n1-n2;
            t3.setText("The difference is:"+d);
        }

        if(ae.getSource()==b3){
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            int p=n1*n2;
            t3.setText("the product is:"+p);
        }

        if(ae.getSource()==b4){
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            int q=n1/n2;
            t3.setText("the quotient is:"+q);
        } 
    }
}