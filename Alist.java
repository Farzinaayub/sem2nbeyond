import java.util.*;
public class Alist{
    public static void main(String args[]){
        ArrayList<String> obj = new ArrayList<>();

        obj.add("alpha");
        obj.add("beta");
        obj.add("gamma");
        obj.add("phi");



        System.out.println("\n Original arraylist:");
        for(String str:obj) System.out.println(str);

        
        System.out.println("\n arraylist after add operation:");
        obj.add(1,"hamiltonian");
        for(String str:obj) System.out.println(str);


        System.out.println("\n arraylist after remove operation:");
        obj.remove("hamiltonian");
        obj.remove(3);
        for(String str:obj) System.out.println(str);


        System.out.println("Arraylist after sorting:");
        Collections.sort(obj);
        for(String str:obj) System.out.println(str);


        System.out.println("\n Object at index 2:"+obj.get(2));
        System.out.println("\n degree is in the ArrayList :"+obj.contains("degree"));
        System.out.println("\n alpha is in the ArrayList :"+obj.contains("alpha"));
        System.out.println("\n Size of the ArrayList:"+obj.size());
        obj.clear();

        System.out.println("\n** ArrayList Removed **");
    }
}
