package com.company;

public class Main {

    public static void main(String[] args) {

        Persona personaUno = new Persona();

        personaUno.setNombre("Juan");
        personaUno.setEdad(19);
        personaUno.setNumeroTelefono(123456789);

        System.out.println("Nombre: " + personaUno.getNombre());
        System.out.println("Edad: " + personaUno.getEdad());
        System.out.println("Numero de telefono: " + personaUno.getNumeroTelefono());

    }
}

class Persona {

    private int edad;
    private String nombre;
    private int numeroTelefono;

    public Persona(int edad, String nombre, int numeroTelefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public Persona() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}