public class Ave extends Animal {
    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueño, double pesoGramos) {
        super(nombre, edad, nombreDueño);
        this.pesoGramos = pesoGramos;
    }

    //28K de base y sube 100 por cada gramo de peso
    @Override
    public double costoConsulta() {
        return 28000.0 + (100.0 * pesoGramos);
    }
}
