//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] animales = new Animal[4];
        animales[0] = new Perro("Firulais", 3, "Carlos", "Labrador", "POL-PERRO-01");
        animales[1] = new Gato("Michi", 2, "Ana", true, "POL-GATO-01");
        animales[2] = new Ave("Piolín", 1, "Luis", 45.5);

        Perro yako = new Perro("Max", 5, "Elena", "Golden", "POL-PERRO-02");
        Gato misha = new Gato("Luna", 4, "Pedro", false, "POL-GATO-02");

        yako.registrarVacuna("Rabia");
        yako.registrarVacuna("Parvovirus");

        misha.registrarVacuna("Triple Felina");

        System.out.println(yako.nombre + " tiene " + yako.getVacunasAplicadas() + " vacunas.");
        System.out.println(misha.nombre + " tiene " + misha.getVacunasAplicadas() + " vacunas.");
    }
}