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
    }
}
