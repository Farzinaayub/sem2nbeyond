
import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=1; i<=q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int wl=1;
            while(wl<n+1){
                int add=0;
                for(int j=1;j<wl+1;j++){
                    
                    int pwr=1;
                    for(int e=0;e<=j-1;e++){
                        if(e==0){
                            pwr=1;
                        }
                        else{
                        pwr=2*pwr;
                        }
                    }
                    int pwrb=pwr*b;
                    add=add+pwrb;
                }
                int adda = add+a;
                System.out.print(adda+" ");
                wl++;
            }
            System.out.println();
        }
        sc.close();
    }
}
