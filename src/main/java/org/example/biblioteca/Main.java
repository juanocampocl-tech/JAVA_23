package org.example.biblioteca;

public class Main {
    public static void main(String[] args) {
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

        materiales[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Novela");
        materiales[1] = new Revista("National Geographic", "Varios", 2023, 150);
        materiales[2] = new Tesis("Algoritmos Genéticos", "Ana Pérez", 2021, "UNAM");

        for (MaterialBiblioteca material : materiales) {
            material.mostrarInfo();
            System.out.println("---");
        }
    }
}
