package Libros;


/* CORRECCIONES
- En esta clase he añadido la clase Persona para el autor y en el constructor por defecto he instanciado el autor, o eso creo que esta haciendo new Persona();
- Al añadir el autor.setNombre(); y autor.setApellidos(); me da error y veo que no has creado los setters y getters asi que lo añado en la clase Persona
 Ademas para que funcione el sc.nextLine() que yo he usado se debe añadir dentro de los parametros del setNombre() y setApellido(), me gustaria saber porque es asi
 y no funciona de la otra manera!?

-

*/


import Personas.Persona;

import java.util.Scanner;

public class Libro {
    // Guarda informacion que se mantiene en una biblioteca sobre cada libro;

    // Atributos:

    // Añado atributo Persona autor
    private Persona autor;
    private String titulo, editorial, ISBN;
    private int paginas, fecha;

    // Metodos:

    public Libro() {
        // Constructor por defecto;
        autor = new Persona();
    }




    public Libro(Libro l1) {
        this.titulo = l1.titulo;
        this.autor = l1.autor;
        this.editorial= l1.editorial;
        this.ISBN = l1.ISBN;
        this.fecha= l1.fecha;
        this.paginas = l1.paginas;
    }


    public void pedirLibro() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca los datos del libro: ");
            System.out.println("- Titulo: ");
            this.titulo = sc.nextLine();
            System.out.println("- Autor: ");
            this.autor.setNombre(sc.nextLine());
            this.autor.setApellidos(sc.nextLine());
            System.out.println("- Editorial: ");
            this.editorial = sc.nextLine();
            System.out.println("- ISBN: ");
            this.ISBN = sc.nextLine();
            System.out.println("- Paginas: ");
            this.paginas = sc.nextInt();
            System.out.println("- Fecha: ");
            this.fecha = sc.nextInt();
        } while(titulo.isEmpty());
    }


    public void mostrar() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Libro: " + "\n"+
                "Titulo = "+ titulo+ "\n"+
                "Autor = " +autor+"\n"+
                "Editorial = "+ editorial+"\n"+
                "ISBN = "+ ISBN+"\n"+
                "Paginas = " + paginas +"\n" +
                "Fecha = " + fecha + "\n" +
                "----------------------------------";}
}
