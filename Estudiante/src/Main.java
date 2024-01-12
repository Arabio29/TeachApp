public class Main {
    public static void main(String[] args) {

        Estudiante Pedro = new Estudiante("Pedro Picapiedra", 13, "AG32KN");
        Estudiante Maritza = new Estudiante("Maritza Jaramillo", 19, "293KSU");
        Estudiante Jose = new Estudiante("Jose Villanueva", 6, "SG27YE5");
        Estudiante Cassandra = new Estudiante("Cassandra Mayela", 18, "CI83SH71");
        System.out.println("");
        Pedro.mostrar_informacion();
        System.out.println("");
        Maritza.mostrar_informacion();
        System.out.println("");
        Jose.mostrar_informacion();
        System.out.println("");
        Cassandra.mostrar_informacion();
        System.out.println("");

        System.out.println("Hello world!");
    }


}