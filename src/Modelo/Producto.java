// Producto.java
package Modelo;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }

    public void aplicarDescuento(double porcentaje) {
        precio -= precio * (porcentaje / 100);
    }

    public void aplicarDescuento(int cantidad, double porcentaje) {
        if (cantidad > 1) {
            aplicarDescuento(porcentaje);
        }
    }
}
