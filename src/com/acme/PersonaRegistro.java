    package com.acme;

    public record PersonaRegistro(String nombre, String apellidos) {

        @Override
        public String toString() {
        //    William comenté la línea de código que considero se puede eliminar
        //    System.out.println("Esta instruccion es inservible");
            return "%s %s".formatted(nombre, apellidos);
        }
    }
