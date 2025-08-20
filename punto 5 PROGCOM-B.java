import java.util.*;  
import java.lang.*;  
import java.io.*;  

public class Main {
    public static void main(String[] args) {
        
        int numero = 3;  
        
        //operador ternario
        String mensaje = (numero % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(mensaje);
        
        //if else
        String mensaje2 = "";
        if (numero % 2 == 0) {
            mensaje2 = "El número es par";
        } else {
            mensaje2 = "El número es impar";
        }
        System.out.println(mensaje2);
        
        //if else if
        String mensaje3 = "";
        if (numero % 2 == 0) {
            mensaje3 = "El número es par";
        } else if (numero % 2 != 0) {
            mensaje3 = "El número es impar";
        }
        System.out.println(mensaje3);
        
        //switch 
        switch (numero % 2) {
            case 0:
                System.out.println("El número es par");
                break;
            case 1:
                System.out.println("El número es impar");
                break;
        }
    }
}