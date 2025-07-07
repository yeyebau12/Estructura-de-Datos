package Esfera;

/**
 * @author Yerson Bautista
 * @version 1.0
 * @since 2023-10-01
 *        Clase que representa una esfera en un espacio tridimensional.
 * 
 */
public class Esfera implements IEsfera {

    private double radio;

    /**
     * Constructor de la clase Esfera.
     * 
     * @param radio El radio de la esfera.
     */

    public Esfera(double radioI) {

        if (radioI > 0) {
            this.radio = radioI;

        } else {
            this.radio = 0.0;
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Metodo para las operaciones de la esfera

    /**
     * Obtiene el diámetro de la esfera.
     * 
     * @return El diámetro de la esfera.
     *         This method calculates the diameter using the formula
     *         diameter = 2 * radius.
     */
    @Override
    public double getDiameter() {

        return (2 * radio);

    }

    /**
     * Obtiene la circunferencia de la esfera.
     * 
     * @return La circunferencia de la esfera.
     *         This method calculates the circumference using the formula
     *         circumference = π * diameter.
     * 
     */
    @Override
    public double getCircumference() {

        return (Math.PI * getDiameter());

    }

    /**
     * Obtiene el área de la esfera.
     * 
     * @return El área de la esfera.
     *         This method calculates the surface area using the formula
     *         area = 4 * π * radius^2.
     */

    @Override
    public double getArea() {

        return (4 * Math.PI * Math.pow(radio, 2));

    }

    /**
     * Obtiene el volumen de la esfera.
     * 
     * @return El volumen de la esfera.
     *         This method calculates the volume using the formula
     *         volume = (4/3) * π * radius^3.
     */

    @Override
    public double getVolume() {

        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }

}
