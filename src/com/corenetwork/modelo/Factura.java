package com.corenetwork.modelo;

public class Factura {
    public int id;
    public double importe;
    public String cliente;
    public String direccionEntrega;


    public double calcularIVA(){
        return importe * 0.21;
    }

    public double calcularIVA(double porcentaje){
        return  importe * porcentaje;
    }



}
