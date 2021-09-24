package com.acme;

public class HolaMundo {

    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribre tu nombre: ");
        String apellidos = msg.solicitaDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre,apellidos);
        msg.saludar(p1);
    }
}
