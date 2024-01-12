public class Main {
    public static void main(String[] args) {

        // Crear instancias de la clase Producto
        Producto producto1 = new Producto("Producto A", 20.0, 10);
        Producto producto2 = new Producto("Producto B", 15.0, 5);

        // Simular una venta exitosa
        producto1.realizarVenta(3);

        // Intentar vender más unidades de las disponibles
        producto2.realizarVenta(7);

    }
}