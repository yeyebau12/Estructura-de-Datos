package Recursividad.Factorial.Num;

public class main {

    public static void main(String[] args) {

        // El factorial de un número n se define como el producto de todos los números
        // enteros positivos desde 1 hasta n.
        // Factorial de 5: 5! = 5 * 4 * 3 * 2 * 1 = 120
        // El factorial de 0 se define como 1: 0! = 1
        Factorial factorial = new Factorial();

        System.out.println("Factorial de 5 : " + "\n" + factorial.recursiveFactorial(5)); // 120
        System.out.println("Factorial de 6 : " + "\n" + factorial.factorialCycle(6)); // 120

    }

}
