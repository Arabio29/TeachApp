public class Producto {

    public String nombre;
    public int precio;
    public int stock;

    public producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void realizarVenta(){
        System.out.println("Comprando...");
        System.out.println("Compra realizada con exito :)");
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
