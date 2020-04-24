package CD;

import java.util.Scanner;

public class Cancion {
    Scanner sc = new Scanner(System.in);
    // Atributos
    String titulo;
    String autor;


    // Metodos:


    // Constructor copia
    public Cancion(Cancion cancion) {
        titulo = cancion.titulo;
        autor = cancion.autor;
    }
    // Constructor:
    public Cancion(String titulo, String autor) {
        titulo = this.titulo;
        autor = this.autor;
    }

    // Constructor predeterminador que inicializa autor y titulo a cadenas vacias;
    public Cancion() {
        this.autor = "";
        this.titulo = "";
    }

    // Metodo dameTitulo y dameAutor;
    public String dameTitulo() {
        System.out.println("Titulo: " + titulo);
        return titulo;
    }

    public String dameAutor() {
        System.out.println("Autor: " + autor);
        return autor;
    }

    // Metodo ponerTitulo y ponerAutor;
    public void ponerTitulo() {
        System.out.println("Indique el título de la canción:");
        titulo = sc.nextLine();
    }

    public void ponerAutor() {
        System.out.println("Indique el autor de la canción");
        autor = sc.nextLine();
    }



}
