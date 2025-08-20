import java.util.*;  
import java.lang.*;  
import java.io.*;  

public class Main {
    public static void main(String[] args) {
        
        int edad = 20;
        
        //operador ternario
        String mensaje = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensaje);
        
        //if else 
        String mensaje2 = "";
        if (edad >= 18) {
            mensaje2 = "Es mayor de edad";
        } else {
            mensaje2 = "Es menor de edad";
        }
        System.out.println(mensaje2);
        
        //if else if
        String mensaje3 = "";
        if (edad >= 18) {
            mensaje3 = "Es mayor de edad";
        } else if (edad < 18) {
            mensaje3 = "Es menor de edad";
        }
        System.out.println(mensaje3);
        
        //switch (otro tipo de else if)

        
    }
}