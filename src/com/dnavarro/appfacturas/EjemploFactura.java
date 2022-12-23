package com.dnavarro.appfacturas;

import com.dnavarro.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("555-A");
        cliente.setNombre("AlgoRitmo");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
        // String nombre;
        // double precio;
        // int cantidad;

        System.out.println();

        for (int i = 0; i < 2 ; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto N° " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextDouble());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
