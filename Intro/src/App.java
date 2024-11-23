import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import javax.swing.SpringLayout;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String name = "Aprendiendo de cadenas en Java";
        System.out.println(name);
        
        Integer n  = 7; 

        System.out.println("mi integer: "+ n);

        Double nD  = 8.5;
        System.out.println("Mi Double: " + nD);

        float nF = 6.5f;
        System.out.println("Mi float: " + nF);
        
        boolean myBool = false;
        if(myBool == true){
            System.out.println("myBool es True");
        }else{
            System.out.println("myBool es False");
        }

        String nullString = "Hola";
        nullString= null;

        if(nullString != null){
            System.out.println("Es distinto de nulo");
        }
        else{
            System.out.println("Es nulo");
        }


        List<String> myList = new ArrayList(); 
        myList.add(name);
        myList.add(n.toString());
        System.out.println(myList);

        Map<String, String> myMap = new HashMap();
        myMap.put("string", name);
        myMap.put("int", n.toString());
        System.out.println(myMap.get("int"));
        System.out.println(myMap);
    }
}
