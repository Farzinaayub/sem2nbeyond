import java.util.Scanner;
class even implements Runnable{
    int n1,n2;
    even(int x,int y){
        n1=x;
        n2=y;
    }
    public void run(){
      
        for(int i=n1;i<=n2;i++){
            if(i%2==0){
                System.out.println("e"+i);
            }
        }
    }
} 

class fibanocci implements Runnable{
    int n1,n2;
    int num=0;
    int x=0;
    int y = 1;
    fibanocci(int l,int u){
        n1=l;
        n2=u;
    }
    public void run(){
  
        System.out.println("f"+0);
        System.out.println("f"+1);
        while(num<n2-1){
            num=x+y;
            if((num>=n1)&&(num<=n2)){
                System.out.println("f"+num);
            }
            x=y;
            y=num;
            
        }
    }
}
public class thread{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit of range");
        int x = sc.nextInt();
        System.out.println("enter the upper limit of range");
        int y = sc.nextInt();
        System.out.println(" ");
        sc.close();


        Runnable r = new fibanocci(x,y);
        Thread obj1 = new Thread(r);
        obj1.start();

        Runnable p = new even(x,y);
        Thread obj2 = new Thread(p);
        obj2.start();
    }
}