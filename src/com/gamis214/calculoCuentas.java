package com.gamis214;


import java.util.Scanner;

public class calculoCuentas {

    private static Scanner sc;
    private static Persona persona;

    public calculoCuentas(Persona persona){
        sc = new Scanner(System.in);
        this.persona = persona;
    }

    public void Operacion(String opc){

        switch (opc){

            case "A":
                System.out.println("-------------------------------------");
                System.out.println("Ingrese el monto a depositar");
                double montoDeposito = sc.nextDouble();
                double montoAnterior = persona.getMonto();
                persona.setMonto(montoDeposito + montoAnterior);
                System.out.println("El monto final es: " + persona.getMonto());
                break;

            case "B":
                System.out.println("-------------------------------------");
                System.out.println("Ingrese el monto a retirar");
                double montoRetiro = sc.nextDouble();
                double montoAnteriorDeposito = persona.getMonto();
                persona.setMonto(montoAnteriorDeposito - montoRetiro);
                System.out.println("El monto final es: " + persona.getMonto());
                break;

        }
    }

}
