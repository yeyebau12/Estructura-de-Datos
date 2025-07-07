package PilaDinamica;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int option = 0;
        int value = 0;
        Pila stack = new Pila();

        try {
            do {

                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Seleccione una opción:\n" +
                                "1. Insertar elemento en la pila\n" +
                                "2. Eliminar elemento de la pila\n" +
                                "3. Ver si la pila está vaciá\n" +
                                "4. Ver el elemento en la cima de la pila\n" +
                                "5. Ver el tamaño de la pila\n" +
                                "6. Limpiar la pila\n" +
                                "7. Salir\n" +
                                "¿Que opción desea realizar?",
                        "Menú de Opciones", JOptionPane.QUESTION_MESSAGE));

                switch (option) {

                    case 1:
                        value = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el valor del elemento que desea insertar en la pila:",
                                "Insertar Datos", JOptionPane.QUESTION_MESSAGE));

                        stack.push(value);
                        break;
                    case 2:
                        if (!stack.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "El valor del elemento eliminado es: " + stack.pop(),
                                    "Eliminar Datos", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede eliminar un elemento.",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 3:
                        if (stack.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.",
                                    "Pila Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila contiene datos.",
                                    "Pila Con Datos",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 4:
                        if (!stack.isEmpty()) {

                            JOptionPane.showMessageDialog(null,
                                    "El elemento en la cima de la pila es : " + stack.peek(),
                                    "Dato en la Cima de la Pila",
                                    JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);

                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es: " + stack.getSize(),
                                "Tamaño de la Pila", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    case 6:
                        if (!stack.isEmpty()) {
                            stack.clear();
                            JOptionPane.showMessageDialog(null,
                                    "Los datos de la pila se han eliminado ",
                                    "Datos Eliminados de la Pila", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);

                        }
                        break;
                    case 7:

                        JOptionPane.showMessageDialog(null, "Saliendo del programa...", "Salir",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, intente de nuevo.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                }

            } while (option != 7);

        } catch (NumberFormatException e) {

            System.out.println("Error :" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }

    }

}
