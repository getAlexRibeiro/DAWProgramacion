package CD;

public class CD {
    // Atributos
    Cancion[] canciones = new Cancion[20];
    private int contador;
    final int max_canciones = 20;

    // Metododos;

    public CD() {
        // Constructor por defecto
    }

    public int numeroCanciones() {
        return contador;
    }

    public Cancion dameCancion(int c) {
        if (c > contador || c < 1) {
            System.out.println("La cancion no existe!");
            return null;
        }
        return canciones[c - 1];
    }


    public void grabaCancion(int n, Cancion c1) {
        Cancion nuevaCancion = new Cancion(c1);
        canciones[n - 1] = nuevaCancion;
    }

    public void agregar(Cancion c1) {
        if (contador < max_canciones) {
            Cancion nuevaCancion = new Cancion(c1);
            canciones[contador] = nuevaCancion;
            contador++;
        }
    }

    public void eliminar(int n) {
        if (n > contador) {
            System.out.println("El disco no tiene tantas canciones");
            return;
        }
        for (int i = n; i <= contador; i++) {
            canciones[i-1] = canciones[i];
        }
        contador--;
    }


}
