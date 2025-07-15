package Recursividad.Factorial.Num;

public class Factorial {

    public Factorial() {
        // Constructor vacío
    }

    /**
     * Validar si n es un número entero no negativo
     * 
     * @return factorial de n si n es no negativo, 0 si n es negativo
     */
    public int recursiveFactorial(int n) {

        if (n < 0) {
            return 0;

        } else if (n == 0) { // caso base

            return 1;// factorial de 0 es 1

        } else {
            // Dominio( problema - 1)
            return n * recursiveFactorial(n - 1); // caso recursivo
        }

    }

    /**
     * Creando un metodo factorial mediante un ciclo
     */
    public int factorialCycle(int n) {

        int fact = 1;
        if (n < 0) {
            return 0;

        } else {

            while (n != 0) {
                fact = n * fact; // multiplicando el valor de n por el factorial
                n--; // decrementando el valor de n
            }
            return fact; // devolviendo el factorial
        }

    }

}
