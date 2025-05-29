package Modelo;

public class Bebida extends Alimento {
    public Bebida(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bebida: " + getNombre() + ", Precio: $" + getPrecio());
    }
}