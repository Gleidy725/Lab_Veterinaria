public class Clinica implements Asegurable {
    private String nombre;
    private String direccion;
    private String numeroPoliza;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPoliza = "POL-CLINICA-" + nombre.toUpperCase();
    }

    @Override
    public double calcularPrimaSeguro() {
        // $5.000.000 fijos por año
        return 5000000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}
