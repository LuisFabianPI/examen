/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
  
import java.util.Scanner;

public class edades {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        {
            int edad = scanner.nextInt();
            
            if (edad >= 60) {
                System.out.println("TERCERA EDAD");
            } else if (edad >= 18) {
                System.out.println("MAYOR DE EDAD");
            } else if (edad <= 3) {
                System.out.println("ES UN BEBÉ");
            } else if (edad >= 4) {
                System.out.println("adolecente");
                
            } else {
                System.out.println("Edad fuera de rango.");
            }
        }
    }
}
    
    
    
