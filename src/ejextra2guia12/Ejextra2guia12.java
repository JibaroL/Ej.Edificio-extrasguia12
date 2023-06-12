package ejextra2guia12;

import Entidades.EdificioDeOficinas;
import java.util.ArrayList;
import Entidades.Edificio;
import Entidades.Polideportivo;
import java.util.Random;

public class Ejextra2guia12 {

    public static void main(String[] args) {

        EdificioDeOficinas building = new EdificioDeOficinas(10, 20, 30, 5, 10, 3);

        building.cantPersonas();

        ArrayList<Edificio> edificios = new ArrayList<>();

        int limitePolideportivos = 5;
        int contadorPolideportivos = 0;
        int contadorTechados = 0;
        int contadorAbiertos = 0;
        Random random = new Random();

        while (contadorPolideportivos < limitePolideportivos) {
            double ancho = random.nextDouble() * 100;
            double alto = random.nextDouble() * 100;
            double largo = random.nextDouble() * 100;

            String nombre = "POLIDEPORTIVO " + (contadorPolideportivos + 1);
            String tipoInstalacion = random.nextBoolean() ? "Techado" : "Abierto";

            Polideportivo polideportivo = new Polideportivo(ancho, alto, largo, nombre, tipoInstalacion);

            edificios.add(building);

            contadorPolideportivos++;

            if (tipoInstalacion.equals("techado")) {
                contadorTechados++;

            } else if (tipoInstalacion.equals("Abierto")) {
                contadorAbiertos++;

            }

        }

        System.out.println("Cantidad de polideportivos techados:  " + contadorTechados);
        System.out.println("Cantidad de polideportivos abiertos:  " + contadorAbiertos);

        //edificios.add(new Polideportivo(15, 23, 35, "Polideportivo 1", "Techado"));
        //edificios.add(new Polideportivo(20, 39, 40, "Polideportivo 2", "Abierto"));
        edificios.add(building);

        for (Edificio edif : edificios) {
            double superficie = edif.calcularSuperficie();
            double volumen = edif.calcularVolumen();

            System.out.println("Superficie del Edificio:  " + superficie);
            System.out.println("Volumen del Edificio:  " + volumen);

            System.out.println("---------------------------------------");

        }

    }
}
