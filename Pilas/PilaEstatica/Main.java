package PilaEstatica;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int option = 0;
        int element;
        int size;

        try {

            size = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pila:",
                    "Tamaño de la pila", JOptionPane.QUESTION_MESSAGE));

            Pila stack = new Pila(size);

            do {

                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Seleccione una opción:\n" +
                                "1. Insertar elemento en la pila\n" +
                                "2. Eliminar elemento de la pila\n" +
                                "3. Ver si la pila está vaciá\n" +
                                "4. Ver si la pila está llena\n" +
                                "5. Ver el elemento en la cima de la pila\n" +
                                "6. Ver el tamaño de la pila\n" +
                                "7. Limpiar la pila\n" +
                                "8. Salir\n" +
                                "¿Que opción desea realizar?",
                        "Menú de Opciones", JOptionPane.QUESTION_MESSAGE));

                switch (option) {
                    case 1:

                        element = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el valor del elemento que desea insertar en la pila:",
                                "Insertar Datos", JOptionPane.QUESTION_MESSAGE));

                        if (!stack.isFull()) {
                            stack.push(element);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está llena. No se puede insertar el elemento.",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
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
                        if (stack.isFull()) {
                            JOptionPane.showMessageDialog(null, "La pila está llena.",
                                    "Pila LLena",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta llena. Puede insertar más elementos",
                                    "Pila No LLena",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
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
                    case 6:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es: " + stack.sizeStack(),
                                "Tamaño de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 7:

                        if (!stack.isEmpty()) {
                            stack = new Pila(size); // Reinicializa la pila
                            JOptionPane.showMessageDialog(null, "La pila ha sido limpiada.",
                                    "Pila Limpiada", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila ya está vacía.",
                                    "Pila Vacía", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 8:

                        JOptionPane.showMessageDialog(null, "Saliendo del programa...", "Salir",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, intente de nuevo.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                }

            } while (option != 8);

        } catch (NumberFormatException e) {

            System.out.println("Error :" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }

    }

}
