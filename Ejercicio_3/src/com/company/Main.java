package com.company;


import java.util.concurrent.ConcurrentHashMap;

class Coche{

    public int numeroPuertas = 0;

    public void incrementarPuertas(){
        this.numeroPuertas++;

    }

}
public class Main {

    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        System.out.println("El numero de puertas de mi coche es: " + miCoche.numeroPuertas);

        System.out.println("El resultado de la suma es:  "+ sumaTres( 5,2,10));

    }

    public static int sumaTres(int a, int b, int c){

        int resultado = a + b + c;

        return resultado;
    }



}
