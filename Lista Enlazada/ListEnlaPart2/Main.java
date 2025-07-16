package ListEnlaPart2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Lista list = new Lista(); // Crea una nueva instancia de Lista
        int option = 0, value;

        do {
            try {
                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al inicio de la lista \n2. Agregar un elemento al final de la lista\n"
                                + "3. Mostrar los datos de la lista\n "
                                + "4. Eliminar el primer elemento de la lista\n"
                                + "5. Salir",
                        "Menú de Opciones", 3));

                switch (option) {
                    case 1:
                        try {
                            value = Integer.parseInt(
                                    JOptionPane.showInputDialog(null, "Ingrese un número:", "Agregar al inicio", 3));

                            list.addStart(value); // Agrega el valor al inicio de la lista

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null,
                                    "Por favor, ingrese un número válido." + e.getMessage());
                        }

                        break;

                    case 2:
                        try {
                            value = Integer.parseInt(
                                    JOptionPane.showInputDialog(null, "Ingrese un número:", "Agregar al final", 3));

                            list.addEnd(value); // Agrega el valor al final de la lista

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null,
                                    "Por favor, ingrese un número válido." + e.getMessage());
                        }

                        break;

                    case 3:
                        list.showList(); // Muestra los elementos de la lista
                        break;
                    case 4:
                        value = list.deleteStart(); // Elimina el primer elemento de la lista
                        // Muestra un mensaje con el valor eliminado
                        JOptionPane.showMessageDialog(null, "El valor eliminado es: " + value,
                                "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);

                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, intente de nuevo.");

                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (option != 5); // Continúa hasta que el usuario elija salir

    }

}
