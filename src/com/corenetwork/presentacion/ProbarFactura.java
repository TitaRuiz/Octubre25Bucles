package com.corenetwork.presentacion;

import com.corenetwork.modelo.Factura;

import java.util.Scanner;

public class ProbarFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el id de la factura ->");
        f1.id = teclado.nextInt();
        System.out.println("Escriba el importe de la factura ->");
        f1.importe = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Escriba el nombre del cliente ->");
        f1.cliente = teclado.nextLine();
        System.out.println("Escriba la dirección de entrega -> ");
        f1.direccionEntrega = teclado.nextLine();

        System.out.println("id factura : " + f1.id + " importe de la factura : " + f1.importe + " cliente : " +
                f1.cliente + " direccion entrega: " + f1.direccionEntrega);
        System.out.println("El iva es ->" + f1.calcularIVA());
        System.out.println("El iva es -> " + f1.calcularIVA(0.06));
    }
}
