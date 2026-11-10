public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueño;

    public Animal(String nombre, int edad, String nombreDueño) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueño = nombreDueño;
    }

    public abstract double costoConsulta();

    public void mostrarFicha() {
        System.out.println("--- Ficha de Paciente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDueño);
        // Llamo al metodo abstracto
        System.out.println("Costo de Consulta: $" + costoConsulta());
    }
}
