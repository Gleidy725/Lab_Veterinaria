//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] animales = new Animal[4];
        animales[0] = new Perro("Bolt", 3, "Steven", "Pinsher", "POL-PERRO-01");
        animales[1] = new Gato("Mercury", 2, "Liliana", true, "POL-GATO-01");
        animales[2] = new Ave("Piolín", 1, "Luis", 45.5);

        Perro perro1 = new Perro("Yako", 5, "José José", "Cocker", "POL-PERRO-02");
        Gato gato1 = new Gato("Misha", 4, "El chavo", false, "POL-GATO-02");

        perro1.registrarVacuna("Rabia");
        perro1.registrarVacuna("Parvovirus");

        gato1.registrarVacuna("Triple Felina");

        System.out.println(perro1.nombre + " tiene " + perro1.getVacunasAplicadas() + " vacunas.");
        System.out.println(gato1.nombre + " tiene " + gato1.getVacunasAplicadas() + " vacunas.");

        Perro pSeguro = new Perro("Rocky", 4, "Sofía", "Bulldog", "POL-PERRO-03");
        Gato gSeguro = new Gato("Garfield", 3, "Mario", true, "POL-GATO-03");
        Clinica clinicaVet = new Clinica("VetCare Central", "Av. Principal 123");

        Asegurable[] asegurables = { pSeguro, gSeguro, clinicaVet };

        for (Asegurable valor : asegurables) {
            System.out.println("Póliza: " + valor.obtenerNumeroPoliza() + " | Prima Anual: $" + valor.calcularPrimaSeguro());
        }

    }
}