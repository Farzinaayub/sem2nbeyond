import java.util.*;
public class Hash{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("Farzeena", 21);
        map.put("Fahmitha",16);
        map.put("Fahiz",24);

        System.out.println("Original Map");
        for(Map.Entry<String,Integer> e:map.entrySet()) System.out.println(e.getKey()+" "+e.getValue());

        System.out.println("On removal of one pair");
        map.remove("Fahiz");
        for(Map.Entry<String,Integer> e:map.entrySet()) System.out.println(e.getKey()+" "+e.getValue());

        System.out.println("on changing value");
        map.replace("Fahmitha", 18);
        for(Map.Entry<String,Integer> e:map.entrySet()) System.out.println(e.getKey()+" "+e.getValue());
    }
}
