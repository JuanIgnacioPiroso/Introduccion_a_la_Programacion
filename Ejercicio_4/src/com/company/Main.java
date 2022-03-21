package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        int numeroIf = 7;

        if (numeroIf > 0) {

            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {

            System.out.println("El numero es negativo");
        } else {

            System.out.println("El numero es 0");
        }

        System.out.println("------------------------------------------");

        int numeroWhile = 2;

        while (numeroWhile < 3) {

            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("---------------------------------------------");

        do {

            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println("---------------------------------------------");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println("Numero for: " + numeroFor);

        }


        System.out.println("------------------------------------------------");

        String estacion = "primavera";

        switch (estacion){

            case "verano":
                System.out.println("Usted se encuentra en el verano");
                break;
            case "otoño":
                System.out.println("Usted se encuentra en el otoño");
                break;
            case "invierno":
                System.out.println("Usted se encuentra en invierno");
                break;
            case "primavera":
                System.out.println("Usted se encuentra en la primavera");
                break;
            default:
                System.out.println("Error eso no es una estacion");
        }


    }

}
