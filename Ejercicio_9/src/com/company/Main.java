package com.company;

public class Main {

    public static void main(String[] args) {
	Cliente clienteUno = new Cliente();
    Trabajador trabajadorUno = new Trabajador();

    clienteUno.setNombre("Juan Ignacio");
    clienteUno.setEdad(19);
    clienteUno.setTelefono(12345678);
    clienteUno.setCredito(5670);

        System.out.println("Nombre: " + clienteUno.getNombre());
        System.out.println("Edad: " + clienteUno.getEdad());
        System.out.println("Telefono: " + clienteUno.getTelefono());
        System.out.println("Credito: " + clienteUno.getCredito());

        System.out.println("----------TRABAJADOR----------");

        trabajadorUno.setNombre("Roberto");
        trabajadorUno.setEdad(32);
        trabajadorUno.setTelefono(98765432);
        trabajadorUno.setSalario((float)9870.54);

        System.out.println("Nombre: " + trabajadorUno.getNombre());
        System.out.println("Edad: " + trabajadorUno.getEdad());
        System.out.println("Telefono: " + trabajadorUno.getTelefono());
        System.out.println("Salario: " + trabajadorUno.getSalario());



    }
}

class Persona{

    int edad;
    String nombre;
    int telefono;

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{

    int credito;

    public Cliente() {
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {

    float salario;

    public Trabajador() {
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
