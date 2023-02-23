package com.sandra.EntradaSalida;

public class Main {
    public static void main(String[] args) {
        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola mundo", EntradaSalida.SALIDA_CONSOLA);
        if(!isOK_consola) System.out.println("ERRROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hola mundo", EntradaSalida.SALIDA_VENTANA);
        if(!isOK_ventana) System.out.println("ERROR VENTANA");

        String nombre = EntradaSalida.entradaString("Cual es tu nombre?");
        EntradaSalida.salida(nombre,EntradaSalida.SALIDA_CONSOLA);

        String direccion = EntradaSalida.entradaString("Cual es tu direccion?");
        EntradaSalida.salida(direccion,EntradaSalida.SALIDA_CONSOLA);

        Integer edad = EntradaSalida.entradaEntero("Cual es tu edad?");
        if (edad != null) EntradaSalida.salida(edad.toString(),EntradaSalida.SALIDA_CONSOLA);
        else EntradaSalida.salida("ERRROR ENTERO", EntradaSalida.SALIDA_CONSOLA);

    }
}