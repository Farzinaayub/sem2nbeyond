import java.util.Scanner;
public class input {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter first name:");
      String First = sc.next();
      System.out.print("enter second dfsname:");
      String Second = sc.next();
      sc.close();
      System.out.println("My name is "+First+" "+Second);
  }  
}
