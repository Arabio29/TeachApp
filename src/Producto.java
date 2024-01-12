//by: eliasib y sus tesos  xd
public class Producto {
    //atributos
    public String nombre;
    public double precio;
    public int stock;

    //constructor
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //metodo realizar venta
    public void realizarVenta(int cantidad){
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada:");
            System.out.println("Producto: " + nombre);
            System.out.println("Precio unitario: $" + precio);
            System.out.println("Cantidad vendida: " + cantidad);
            System.out.println("Total: $" + (precio * cantidad));
            System.out.println("Stock restante: " + stock);
        } else {
            System.out.println("No hay stock suficiente para la venta.");
        }
    }

}
