package com.sandra.EntradaSalida;
import javax.swing.*;
import java.util.Scanner;

public class EntradaSalida {
    /**
     * Entraada con scanner de un mensaje
     * @param mensaje que el usuario ve para saber que introducir
     * @return mensaje
     */
    public static String entradaString(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        try{
            String dato = sc.nextLine();
            return dato;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * Entrada con scanner de un entero
     * @param mensaje que el usuario ve para saber que introducir
     * @return entero
     */
    public static Integer entradaEntero(String mensaje){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(mensaje);
            Integer entero = sc.nextInt();
            return entero;
        }catch(Exception e){
            return null;
        }
    }

    /**
     * Entrada con scanner de un float
     * @param mensaje que el usuario ve para saber que introducir
     * @return decimal
     */
    public static Float entradaFloat(String mensaje){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(mensaje);
            Float decimal = sc.nextFloat();
            return decimal;
        }catch(Exception e){
            return null;
        }
    }

    public static final int SALIDA_CONSOLA = 1;
    public static final int SALIDA_VENTANA = 2;

    /**
     * Salida por consola o ventana de un mensaje
     * @param mensaje que queremos visualizar
     * @param dispositivo que queremos usar para la salida del mensaje
     */
    public static boolean salida(String mensaje, int dispositivo){
        switch(dispositivo){
            case SALIDA_CONSOLA:
                try{
                    System.out.println("Consola: " + mensaje);
                    return true;
                }catch(Exception e){
                    return false;
                }
            case SALIDA_VENTANA:
                try{
                    JOptionPane.showMessageDialog(null, mensaje);
                    JOptionPane.showMessageDialog(null, "Sale por ventana.");
                    return true;
                }catch(Exception e){
                    return false;
                }
            default:
                return false;
        }
    }
}
