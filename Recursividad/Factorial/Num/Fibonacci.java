package Recursividad.Factorial.Num;

public class Fibonacci {

    public Fibonacci() {
        // Constructor vacío
    }

    /**
     * Calcula el n-ésimo número de Fibonacci de forma recursiva.
     * 
     * @param n El índice del número de Fibonacci a calcular.
     * @return El n-ésimo número de Fibonacci.
     */
    public int recursiveFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) { // caso base
            return 1;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }

    /**
     * Creando el metodo de fibonacci con ciclo
     * 
     * @param n El índice del número de Fibonacci a calcular.
     * @return El n-ésimo número de Fibonacci.
     */

    public int iterativeFibonacci(int n) {

        int fibo = 0, one = 1, two = 0;

        while (n > 0) {

            fibo = one + two;
            one = two;
            two = fibo;
            n--;
        }
        return fibo;
    }

}
