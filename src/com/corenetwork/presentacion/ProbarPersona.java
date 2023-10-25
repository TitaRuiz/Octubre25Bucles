package com.corenetwork.presentacion;

import com.corenetwork.modelo.Persona;

public class ProbarPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.altura = 1.87;
        p1.colorPelo = "castaño";
        p1.estadoCivil = 'S';
        p1.DNI = "1345678A";
        p1.genero = 'H';
        p1.nombre = "Adrian Ballester";
        p1.peso = 80.5;

        System.out.println(p1.nombre);
        System.out.println(p1.DNI);

        Persona p2 = new Persona();
        p2.altura = 1.67;
        p2.colorPelo = "blanco";
        p2.peso = 55.5;
        p2.estadoCivil = 'C';
        p2.DNI = "23456789B";
        p2.genero = 'M';
        p2.nombre = "Laura Flores";

        System.out.println(p2.DNI);
        System.out.println(p2.nombre);



    }
}
