package Esfera;

/**
 * @author Yerson Bautista
 * @version 1.0
 * @since 2023-10-01
 *        Clase que representa una esfera en un espacio tridimensional.
 */
public class Main {

    public static void main(String[] args) {

        Esfera sphere = new Esfera(5);

        System.out.println("Radio: " + sphere.getRadio());
        System.out.println("Diametro: " + sphere.getDiameter());
        System.out.println("Circunferencia: " + sphere.getCircumference());
        System.out.println("Area: " + sphere.getArea());
        System.out.println("Volumen: " + sphere.getVolume());
    }

}
