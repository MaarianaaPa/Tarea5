package unam.fes.poo.tarea5poo;

import java.util.Scanner;

/**
 *
 * @author ZaraL
 */
public class Tarea5POO {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //variables
        String cadena = "";

        System.out.println("Introduzca la cadena (X, O, _): ");
        cadena = teclado.nextLine();
        if (cadena.length() == 9) {//cuenta desde 0 a 8
            System.out.println("Has ingresado los 9 caracteres");
            if(!cadena.matches("[XO_]{9}")){
                System.out.println("La cadena tiene caracteres diferentes");
            }
            else {
                System.out.println("_ _ _ _");
                String cadena1 = "|" + cadena.charAt(0)+ "|" + cadena.charAt(1)+ "|" + cadena.charAt(2) + "|";
                System.out.println(cadena1);
                String cadena2 = "|" + cadena.charAt(3)+ "|" + cadena.charAt(4)+ "|" + cadena.charAt(5) + "|";
                System.out.println(cadena2);
                String cadena3 = "|" + cadena.charAt(6)+ "|" + cadena.charAt(7)+ "|" + cadena.charAt(8) + "|";
                System.out.println(cadena3);
                System.out.println("_ _ _ _");
            }
        }
        else {
            System.out.println("La cadena no contiene 9 caracteres");
        }
    }
}
