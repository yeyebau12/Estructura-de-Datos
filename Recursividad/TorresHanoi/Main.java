package Recursividad.TorresHanoi;

public class Main {

    public static void main(String[] args) {

        // Definimos el numero de discos
        int numberOfDisks = 64;

        // Creamos una instancia de la clase Main
        Main hanoi = new Main();

        // Llamamos al metodo hanoiTower para resolver el problema
        hanoi.hanoiTower(numberOfDisks, 1, 2, 3);

    }

    /*
     * Creando el metodo recursivo para resolver las Torres de Hanoi
     */
    public void hanoiTower(int disk, int tower1, int tower2, int tower3) {
        // Caso Base
        if (disk == 1) {
            System.out.println("Mover disco " + disk + " de torre " + tower1 + " a torre " + tower3);
        } else {
            // Dominio de la recursividad
            hanoiTower(disk - 1, tower1, tower3, tower2);
            System.out.println("Mover disco " + disk + " de torre " + tower1 + " a torre " + tower3);
            hanoiTower(disk - 1, tower2, tower1, tower3);

        }
    }
}
