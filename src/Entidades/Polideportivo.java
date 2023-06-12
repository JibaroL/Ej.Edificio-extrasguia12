package Entidades;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;

    }

    @Override
    public double calcularSuperficie() {

        return 2 * (alto * ancho + alto * largo + ancho * largo);

    }

    @Override
    public double calcularVolumen() {

        return alto * ancho * largo;
    }
}
