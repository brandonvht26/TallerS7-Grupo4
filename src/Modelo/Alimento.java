package Modelo;

public class Alimento extends Producto {
    public Alimento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Alimento: " + getNombre() + ", Precio: $" + getPrecio());
    }
}