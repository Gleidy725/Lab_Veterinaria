import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private List<String> vacunas;
    private String numeroPoliza;

    public Gato(String nombre, int edad, String nombreDueño, boolean esEsterilizado, String numeroPoliza) {
        super(nombre, edad, nombreDueño);
        this.esEsterilizado = esEsterilizado;
        this.vacunas = new ArrayList<>();
        this.numeroPoliza = numeroPoliza;
    }

    @Override
    public double costoConsulta() {
        // $38.000 fijo
        return 38000.0;
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunas.add(nombreVacuna);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }


    //Si está esterilizado son 120 fijos sino 200
    @Override
    public double calcularPrimaSeguro() {
        return esEsterilizado ? 120000.0 : 200000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}