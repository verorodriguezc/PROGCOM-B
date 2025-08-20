import java.util.*;  
import java.lang.*;  
import java.io.*;  

public class Main {
    public static void main(String[] args) {
        
        int nota = 70; 
        
        //operador ternario
        String mensaje = (nota >= 60) ? "Aprobado" : "Reprobado";
        System.out.println(mensaje);
        
        //if else
        String mensaje2 = "";
        if (nota >= 60) {
            mensaje2 = "Aprobado";
        } else {
            mensaje2 = "Reprobado";
        }
        System.out.println(mensaje2);
        
        //if else if
        String mensaje3 = "";
        if (nota >= 60) {
            mensaje3 = "Aprobado";
        } else if (nota < 60) {
            mensaje3 = "Reprobado";
        }
        System.out.println(mensaje3);
        
        //switch
        int resultado = (nota >= 60) ? 1 : 0;
        switch (resultado) {
            case 1:
                System.out.println("Aprobado");
                break;
            case 0:
                System.out.println("Reprobado");
                break;
        }
    }
}