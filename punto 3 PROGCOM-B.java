import java.util.*;  
import java.lang.*;  
import java.io.*;  

public class Main {
    public static void main(String[] args) {
        
        int a = 5;   
        int b = 20;  
        
        // --- Usando operador ternario ---
        String mensaje = (a > b) ? "El mayor es: " + a : "El mayor es: " + b;
        System.out.println(mensaje);
        
        // --- Con if else ---
        String mensaje2 = "";
        if (a > b) {
            mensaje2 = "El mayor es: " + a;
        } else {
            mensaje2 = "El mayor es: " + b;
        }
        System.out.println(mensaje2);
        
        // --- Con if else if ---
        String mensaje3 = "";
        if (a > b) {
            mensaje3 = "El mayor es: " + a;
        } else if (b > a) {
            mensaje3 = "El mayor es: " + b;
        } else {
            mensaje3 = "Ambos números son iguales";
        }
        System.out.println(mensaje3);
        
        // --- Con switch ---
        // Convertimos la comparación a un valor entero:
        // 1 = a mayor, -1 = b mayor, 0 = iguales
        int comparacion = Integer.compare(a, b);
        switch (comparacion) {
            case 1:
                System.out.println("El mayor es: " + a);
                break;
            case -1:
                System.out.println("El mayor es: " + b);
                break;
            case 0:
                System.out.println("Ambos números son iguales");
                break;
        }
    }
}
