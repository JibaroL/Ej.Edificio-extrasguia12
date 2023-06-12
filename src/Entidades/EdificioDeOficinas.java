
package Entidades;

public class EdificioDeOficinas extends Edificio{
    
    private int numeroOficinas;
    private int cantidadPersonas;
    private int numerosPisos;

    public EdificioDeOficinas(int numeroOficinas, int cantidadPersonas, int numerosPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.numerosPisos = numerosPisos;
    }

    @Override
    
    public double calcularSuperficie(){
        
        return 2 * (alto * ancho + alto * largo + ancho * largo);
    
    }
    
    @Override
    public double calcularVolumen(){
        
        return alto * ancho * largo;
        
    }
    
    public void cantPersonas(){
        
        int totalPersonas = numeroOficinas * cantidadPersonas;


int personasPorPiso = cantidadPersonas;

        System.out.println("Personas por piso:   " + personasPorPiso);
        System.out.println("Personas en todo el edificio:  " + totalPersonas);
    }
    
    
}
