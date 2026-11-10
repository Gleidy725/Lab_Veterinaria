import java.util.ArrayList;
import java.util.List;
public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private List<String> vacunas;
    private String numeroPoliza;

    public Perro(String nombre, int edad, String nombreDueño, String raza, String numeroPoliza) {
        super(nombre, edad, nombreDueño);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
        this.numeroPoliza = numeroPoliza;
    }

    //45000 de base + 3000 por cada año que tenga
    @Override
    public double costoConsulta() {
        return 45000.0 + (3000.0 * edad);
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunas.add(nombreVacuna);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    //80000
    @Override
    public double calcularPrimaSeguro() {
        return 80000.0 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}
