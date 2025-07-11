package Arreglos.Dinamica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author Yerson Bautista
 * @version 1.0
 * @since
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> chains;
        chains = new ArrayList<String>();
        String phrases;
        String answer;

        do {

            phrases = JOptionPane.showInputDialog(null, "Ingrese una frase: ");
            // agregar la frase al ArrayList
            chains.add(phrases);
            // preguntar si desea ingresar otra frase
            answer = JOptionPane.showInputDialog(null, "¿Desea ingresar otra frase? (SI/NO)").toUpperCase();

        } while (!answer.equals("NO"));

        // mostrar las frases ingresadas

        System.out.println("Frases Originalmente ingresadas:");
        for (int i = 0; i < chains.size(); i++) {

            StringBuilder sb = new StringBuilder();
            sb.append("Frase ").append(i + 1).append(": ").append(chains.get(i));
            System.out.println(sb.toString());
        }

        // utilizar metodo set
        chains.set(1, "Frase modificada");

        // mostrar las frases ingresadas
        System.out.println("Frases modificadas:");
        for (int i = 0; i < chains.size(); i++) {

            StringBuilder sb = new StringBuilder();
            sb.append("Frase ").append(i + 1).append(": ").append(chains.get(i));
            System.out.println(sb.toString());
        }

        // utilizar metodo remove
        chains.remove(0);

        // mostrar las frases ingresadas
        System.out.println("Frases que quedan:");
        for (int i = 0; i < chains.size(); i++) {

            StringBuilder sb = new StringBuilder();
            sb.append("Frase ").append(i + 1).append(": ").append(chains.get(i));
            System.out.println(sb.toString());
        }

    }

}
