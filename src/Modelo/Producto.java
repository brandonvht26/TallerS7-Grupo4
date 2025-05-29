package Modelo;
// Informacion Modelo

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }


    public void mostrarInformacion()
    {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }

    // Informacion Sobrecargada
    public void aplicarDescuento(double porcentaje)
    {
        precio -= precio * (porcentaje / 100);
    }

    public void aplicarDescuento(int cantidad, double porcentaje)
    {
        if (cantidad > 1) {
            aplicarDescuento(porcentaje);
        }
    }
}