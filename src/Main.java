public class Main {
    public static void main(String[] args) {

        // Crear instancias de la clase Producto
        Producto producto1 = new Producto("Producto A", 20.0, 10);
        Producto producto2 = new Producto("Producto B", 15.0, 5);
        Producto celular = new Producto("Tecno pova 5", 650, 39);

        // Simular una venta exitosa
        producto1.realizarVenta(3);

        // Intentar vender más unidades de las disponibles
        producto2.realizarVenta(7);

        celular.realizarVenta(32);

    }
}