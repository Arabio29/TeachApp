public class Estudiante {

    // atributos
    private String nombre;
    private int edad;
    private String matricula;

    // constructor
    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMatricula() {
        return matricula;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostrar_informacion() {
        System.out.println("INFORMACION DEL ESTUDIANTE");
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad del estudiante: " + edad);
        System.out.println("Matrícula: " + matricula);
    }
}
