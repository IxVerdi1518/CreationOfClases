
package com.mycompany.creaciondeclasesjava;

import clases.Persona;

public class CreacionDeClasesJava {

    public static void main(String[] args) {
        System.out.println("CREACION DE CLASES");
        System.out.println("Crea el objeto:");
        Persona persona1 = new Persona();
        persona1.nombre="Samantha";
        persona1.apellido="Terán";
        persona1.ImprimirNombre();
        Persona persona2 = new Persona("Esteban", "Flores");
    }
}
