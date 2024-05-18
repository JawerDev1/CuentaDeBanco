package com.proyectoUno;

public class Cajero {

    private CuentaDeBanco cuenta;

    public Cajero(CuentaDeBanco cuenta){
        this.cuenta = cuenta;
    }

    //metodos
    public void verDinero(){
        System.out.println("Tu dinero es: " + cuenta.getDinero());
    }

    public void depositarDinero(double depositarCantidad){
        cuenta.setDinero(cuenta.getDinero() + depositarCantidad);
        verDinero();
    }

    public void retirarDinero(double retirarCantidad){
        if (retirarCantidad>cuenta.getDinero()){
            System.out.println("Saldo insuficiente");
        }else {
            cuenta.setDinero(cuenta.getDinero() - retirarCantidad);
            verDinero();
        }

    }
}
