package Recursividad.Factorial.Num;

public class main {

    public static void Main(String[] args) {

        // El factorial de un número n se define como el producto de todos los números
        // enteros positivos desde 1 hasta n.
        // Factorial de 5: 5! = 5 * 4 * 3 * 2 * 1 = 120
        // El factorial de 0 se define como 1: 0! = 1
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Factorial de 5 : " + "\n" + factorial.recursiveFactorial(5)); // 120
        System.out.println("Factorial de 6 : " + "\n" + factorial.factorialCycle(6)); // 120
        System.out.println("***************************************************************");
        System.out.println("Fibonacci de 12 : " + "\n" + fibonacci.recursiveFibonacci(12)); // 55
        System.out.println("Fibonacci de 20 : " + "\n" + fibonacci.recursiveFibonacci(1)); // 6765
        System.out.println("Fibonacci de 30 : " + "\n" + fibonacci.recursiveFibonacci(30)); // 832040
        System.out.println("***************************************************************");
        System.out.println("Fibonacci de 12 con ciclo : " + "\n" + fibonacci.iterativeFibonacci(12)); // 144
        System.out.println("Fibonacci de 20 con ciclo : " + "\n" + fibonacci.iterativeFibonacci(20)); // 6765

    }

}
