public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("\u00F6");
    }
}


 // para crear archivo java siemtpe ctrl ship p 

 // ESTO ES UN COMENTARIO
 
 /* 
 ESTO ES UN BLOQUE 
 DE COMENTARIO
 
  * @param args
  * @return void
 */


public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("Mision tic");
        int variable=8;
        System.out.println("variable");
        boolean variable2 = true;
        String variable3 = "Miguel";
        float variable4 = 1.2f; //  EN LOS FLOTANTES SIEMPRE VA f
        double variable5 = 1.8;
        System.out.println(variable4-variable5);
        char variable6 = '1';
        byte variable7 = 5;
        short variable8 = 5;
        int variable9 = 5;
        long variable10 = 5;
        int [] lista = {5,9,3,2}; // arreglos []
        System.out.println(variable7);
        System.out.println(lista[1]);
        String [] lista2 = {"HOLA","COMO","ESTAS"};
       var variable11 = 123; // var le da valor int 123 o string "hola"
        variable11 = 65;
        String variable12 = "hola\t\"mundo\""; // lo saco con alt 92\
        System.out.println(variable12);
        System.out.println("\u00F6");  // caracteres unicout siempre alt 92 u pegado todo
    }
}