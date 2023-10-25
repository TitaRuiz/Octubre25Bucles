package com.corenetwork.presentacion;





import com.corenetwork.modelo.Coche;

import java.util.Scanner;

public class ProbarCoche {
    public static void main(String[] args) {


        Coche c1 = new Coche();
        c1.color="amarillo";
        c1.electrico = false;
        c1.modelo = "Auris";
        c1.tipoMotor = "gasolina";
        c1.numPuertas = 5;

        Coche c2 = new Coche();
        c2.color = "rojo";
        c2.tipoMotor = "electrico";
        c2.modelo = "Renault xx";
        c2.numPuertas = 3;
        c2.electrico = true;


    }
}
