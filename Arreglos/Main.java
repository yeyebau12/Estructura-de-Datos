package Arreglos;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @author Yerson Bautista
 * @version 1.0
 * @since 2025-07-06
 *        Clase principal para ejecutar el programa.
 */
public class Main {

    public static void main(String[] args) {

        String[] words = new String[5];
        int[] numbers = new int[10];
        int i;

        for (i = 0; i < numbers.length; i++) {
            numbers[i] = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del indice: " + i)); // Asignar
        }

        // Mostrar los elementos del arreglo

        System.out.println("\n Los datos sin ordenar son:");

        for (i = 0; i < numbers.length; i++) {
            System.out.println("Elemento en el indice " + i + ": [" + numbers[i] + "]");
        }

        // Ordenar el arreglo

        System.out.println("\n Los datos ordenados son:");
        Arrays.sort(numbers); // Ordenar el arreglo

        for (i = 0; i < numbers.length; i++) {
            System.out.println("Elemento en el indice " + i + ": [" + numbers[i] + "]");
        }

        // Agregar palabras al arreglo

        Arrays.fill(words, "Bienvenidos a la programacion en Java");
        System.out.println("\n Las palabras en el arreglo son:");

        for (i = 0; i < words.length; i++) {
            System.out.println("Palabra en el indice " + i + ": [" + words[i] + "]");
        }

    }

}
