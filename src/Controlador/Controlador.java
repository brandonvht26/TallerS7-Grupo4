package Controlador;

import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    private ArrayList<Producto> productos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> agregarProducto();
                case 2 -> mostrarProductos();
                case 3 -> aplicarDescuento();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n------------- MENÚ -------------");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Aplicar descuento");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarProducto() {
        System.out.println("Tipo (1-Alimento, 2-Bebida, 3-Bebida Energética): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        switch (tipo) {
            case 1 -> productos.add(new Alimento(nombre, precio));
            case 2 -> productos.add(new Bebida(nombre, precio));
            case 3 -> productos.add(new BebidaEnergetica(nombre, precio));
            default -> System.out.println("Tipo inválido.");
        }
    }

    private void mostrarProductos() {
        System.out.println("\n--- Lista de productos ---");
        for (Producto p : productos) {
            p.mostrarInformacion(); // polimorfismo
        }
    }

    private void aplicarDescuento() {
        System.out.print("Porcentaje de descuento: ");
        double porcentaje = scanner.nextDouble();
        for (Producto p : productos) {
            p.aplicarDescuento(porcentaje);
        }
        System.out.println("Descuento aplicado.");
    }
}