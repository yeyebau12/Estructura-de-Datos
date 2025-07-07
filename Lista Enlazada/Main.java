public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 123456789);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 987654321);
        Libro libro3 = new Libro("Don Juan", "Tirso de Molina", 192837465);

        Libro libro4 = new Libro("El Principito", "Antoine de Saint-Exupéry", 112233445);
        // Insertar libros al principio
        lista.insertarPrincipio(libro4);

        // Insertar libros en la lista
        lista.insertarFinal(libro1);
        lista.insertarFinal(libro2);
        lista.insertarFinal(libro3);

        // Obtener y mostrar un libro
        Libro libroObtenido = lista.obtener(2);
        if (libroObtenido != null) {
            System.out.println("Libro obtenido: " + libroObtenido.getTitulo());
        }

        // Contar libros en la lista
        System.out.println("Total de libros en la lista: " + lista.contar());

        // Insertar un libro en una posición específica
        lista.insertarPosicion(1, new Libro("1984", "George Orwell", 111222333));
        System.out.println("Libro en la posición 2: " + lista.obtener(2).getTitulo());
        System.out.println("Total de libros en la lista después de insertar: " + lista.contar());

        // Mostrar todos los libros en la lista
        System.out.println("Libros en la lista:");
        for (int i = 0; i < lista.contar(); i++) {
            Libro libro = lista.obtener(i);
            if (libro != null) {
                System.out.println("- " + libro.getTitulo());
            }
        }

        // Eliminar un libro de la lista
        lista.eliminarPosicion(2);
        System.out.println("Total de libros en la lista después de eliminar: " + lista.contar());
        System.out.println("Libros en la lista después de eliminar:");
        for (int i = 0; i < lista.contar(); i++) {
            Libro libro = lista.obtener(i);
            if (libro != null) {
                System.out.println("- " + libro.getTitulo());
            }
        }

    }

}
