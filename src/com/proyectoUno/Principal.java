package com.proyectoUno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        CuentaDeBanco cuenta = new CuentaDeBanco();
        cuenta.setNombre("Jawer");
        cuenta.setDinero(5000);
        Cajero cajero = new Cajero(cuenta);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, "+ cuenta.getNombre());
        System.out.println("Ingresa la opcin que necesitar realizar: ");
        System.out.println("1. Ver el dinero de tu cuenta");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");

        while (true){
            int input = sc.nextInt();
            switch (input){
                case 1:
                    cajero.verDinero();
                    System.out.println("Ingresa otro numero para poder realizar otra opcion: ");
                    break;
                case 2:
                    System.out.println(cuenta.getNombre()+ ", ¿Cuanto dinero deseas depositar?");
                    double depositar = sc.nextDouble();
                    cajero.depositarDinero(depositar);
                    System.out.println("Ingresa otro numero para poder realizar otra opcion: ");
                    break;
                case 3:
                    System.out.println(cuenta.getNombre() + ", ¿Cuando dinero deseas retirar?");
                    double retirar = sc.nextDouble();
                    cajero.retirarDinero(retirar);
                    System.out.println("Ingresa otro numero para poder realizar otra opcion: ");
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios!");
                    System.exit(0);
                default:
                    System.out.println("Error, ingresa nuevamente otra opcion: ");
                    break;
            }
        }



    }
}
