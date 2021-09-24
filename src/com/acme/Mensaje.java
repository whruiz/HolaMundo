package com.acme;

import java.util.Scanner;

public class Mensaje {
    public String solicitaDatos(String mensaje) {
        System.out.print(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(Persona p) {
        System.out.printf("Hola %s, Bienvenido a Java \n", p);
    }
}

