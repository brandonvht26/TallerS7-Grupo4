package Modelo;

public class BebidaEnergetica extends Bebida {
    public BebidaEnergetica(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bebida Energética: " + getNombre() + ", Precio: $" + getPrecio());
    }
}