package com.gamis214;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Un banco tiene 3 clientes que pueden hacer depositos y retiros.
         * Tambien el banco requiere que al final del dia calcule la cantidad de dinero que hay depositada */

        Persona per1 = new Persona(1,"Ivan",1000);
        Persona per2 = new Persona(2,"Diego",1000);
        Persona per3 = new Persona(3,"Badillo",1000);

        String Operacion;

        Scanner sc= new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("BIEVENIDO AL BANCO XYZ, Ingrese su numero de cuenta:");
        int cuenta = sc.nextInt();

        switch (cuenta){
            case 1:
                System.out.println("Bienvenido " + per1.getNombre() );
                System.out.println("-------------------------------------");
                System.out.println("Ingrese la operacion a realizar: \n A.- Depositar \n B.-Retirar");
                Operacion = sc.next();

                calculoCuentas ca = new calculoCuentas(per1);
                ca.Operacion(Operacion);

                break;
            case 2:
                System.out.println("Bienvenido " + per2.getNombre() );
                System.out.println("-------------------------------------");
                System.out.println("Ingrese la operacion a realizar: \n A.- Depositar \n B.-Retirar");
                Operacion = sc.next();

                calculoCuentas ca2 = new calculoCuentas(per1);
                ca2.Operacion(Operacion);

                break;
            case 3:
                System.out.println("Bienvenido " + per3.getNombre() );
                System.out.println("-------------------------------------");
                System.out.println("Ingrese la operacion a realizar: \n A.- Depositar \n B.-Retirar");
                Operacion = sc.next();

                calculoCuentas ca3 = new calculoCuentas(per1);
                ca3.Operacion(Operacion);

                break;
            default:
                System.out.println("Cuenta no registrada");
                System.exit(0);
                break;
        }

    }
}
