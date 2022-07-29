import java.util.Scanner;
public class Avgnex{
    public static void main(String args[]){
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Count ooooooooof numbers:");
        
        int N = sc.nextInt();


        int[] numbers = new int[N];
        System.out.println("Enter the numbers");
        for(int i=0;i<N;i++){
            numbers[i] = sc.nextInt();
            try{
                if(numbers[i]>=0){
                    sum+=numbers[i];
                }
                else{
                    throw new negative_exception("entry should be positive");
                }
            }
            catch(negative_exception e){
                System.out.println(e.getMessage());
            }
        }

        double avg = sum/N;
        System.out.println("Average of positive numbers="+avg);
        sc.close();
    }
}

class negative_exception extends Exception{
    public negative_exception(String s){
        super(s);
    }
}
