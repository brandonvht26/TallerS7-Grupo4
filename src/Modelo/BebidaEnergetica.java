package Modelo;
//OVERRIDE
public class BebidaEnergetica extends Bebida {
    public BebidaEnergetica(String nombre, double precio) {
        super(nombre, precio);
    }
// SOBREESCRITURA DE BEBIDA
    @Override
    public void mostrarInformacion()
    {
        System.out.println("Bebida Energética: " + getNombre() + ", Precio: $" + getPrecio());
    }
}