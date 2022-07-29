import java.awt.*;
import java.awt.event.*;

public class Max {
    public static void main(String args[]){
        Frr ob = new Frr();
        ob.setVisible(true);
    }
}
class Frr extends Frame implements ActionListener{
    Button b1;
    TextField t1,t2,t3,t4;
    Label l1,l2,l3,l4;

    Frr(){
        l1=new Label("First Number");
        l2=new Label("Second Number");
        l3=new Label("Third Number");
        l4=new Label("Biggest Number");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);

        b1=new Button("Find Maximum");
        add(b1);
        b1.addActionListener(this);

        setLayout(new FlowLayout());
        setBackground(Color.DARK_GRAY);
        b1.setBackground(Color.LIGHT_GRAY);
        setSize(300,200);
    }
    public void actionPerformed(ActionEvent ae){
        int a,b,c;
        int result;
        if(ae.getSource()==b1){
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=Integer.parseInt(t3.getText());
            if (a>b) {
                if (a>c)
                    result=a;
                else
                    result=c;
            }
            else{
                if (b>c)
                    result=b;
                else
                    result=c;
            }
            t4.setText("the biggest is: "+result);
        }
    }
}
