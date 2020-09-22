
package Pruebas;

import java.util.Scanner;

public class Prueba_Clases {

    public static void main(String argv[]) {
    
        Scanner scanner=new Scanner(System.in);
        String nombre="Pablo";
        
        System.out.println("Ingrese su saludo");
        String saludo=scanner.nextLine();
        System.out.println(saludo+" "+nombre);
        
    }
}
