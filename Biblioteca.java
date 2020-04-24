package Libros;


/*
 CORRECCION DE BIBLIOTECA;
- La clase biblioteca la tenia a media hacer, te pase lo que tenia el dia 29.
- No tenia el constador de libros pero tenia creado un maximo de libros por biblioteca para ser introducido por parametros, no se porque lo he hecho asi.
- La clase mostrar estaba mal, me fatala iterar sobre el array para mostrar los libros uno tras otro, creo que aun no me queda del todo
claro el funcionamiento del array, la forma de llamarlo y acceder a el;
- Veo que esta clase la tenia a medias, algunas cosas funcionaban pero al final no terminaba de funcionar el metodo de mostrar la biblioteca,
me he fijado que has usado el contructor copia aun que dices que no hace falta, que diferencia hay?
- Otra cosa que no he conseguido hacer es ordenar la biblioteca, no veo que nos lo hayas mandado, seria interesante al menos
ver como se hace.
Por lo general me gustaria que me comentaras sobre el codigo que he enviado, sobretodo me gustaria comentarios constructivos,
mostrandome en que he acertado para asi al menos saber por lo que estoyu haciendo correctamente ya que hasta ahora me siento
un completo inutil.
Tambien me gustaria que me comentaras los erres:
¿porque no debo crear un metodo constructor si estoy al final se esta creando una biblioteca?
¿Porque mi metodo rellernarBiblioteca() no funciona?
¿Mi  metodo mostrar que lo que hace es llamar al toString() de libro puede ser viable?¿Si hubiuese iterado sobre los libros de la biblioteca
o algo por el estilo, estaria bien? ¿En caso de ser viable, me lo puedes corregir?

- Por ultimo intente el ordenar la biblioteca sin exito ya que otras partes del codigo no funcionaban, me puedes comentar si esta
bien o mal? En caso de estar mal, me puedes hacer una pequeña explicacion?


 */


import javax.swing.*;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    // Atributos : array de Libros

    private Libro[] biblio = new Libro[100];
    // final int max_libros = 10;
    private int max_libros = 2;
    private int contLibros = 0;



   /*
   Tenia un metodo constructor que inicializaba la biblioteca
    public Biblioteca() {
        Libro[] biblioteca = new Libro[max_libros];
        // Constructor por defecto
    }*/


   public int numeroLibros() {

       return contLibros;
   }

   /*
   Este es mi metodo insertarLibro(), no estoy seguro de porque no funciona ya que me da un NullPointerException cuando hago un mostrar
   libros pero si me deja insertar libros como yo quiero;
   ¿Me puedes explicar porque no termina de funcionar?
   public void rellenarBiblioteca() {
        Libro[] biblioteca = new Libro[max_libros];
        for (int i = 0; i < biblioteca.length; i++) {
            Libro libro = new Libro();
            libro.pedirLibro();
            biblioteca[i] = libro;
            contLibros++;
        }
}
*/

    public int insertarLibro(Libro libroAInsertar) {
        if (contLibros > 100 ) return -1;
        Libro nuevoLibro = new Libro(libroAInsertar);
        biblio[contLibros] = nuevoLibro;
        contLibros++;
        return 0;

    }

    /*
    Aqui tenia un metodo mostrar() el cual esperaba que mostrase la biblioteca completa, haciendo un toString de los Libros uno tras otro y ordenados
    por titulo llamando al metodo toString()
    public void mostrar() {

        System.out.println(toString());
    }
    */
// Metodo corregido
    public void mostrarLibros() {
        if (contLibros > 0) {
            for (int i = 0; i < max_libros; i++) {
                System.out.println("Libro " + (i + 1) + "\n\n" + biblio[i].toString() + "\n");
            }
        } else
            System.out.println("No hay libros para mostrar");
    }

  /*  public void ordenarBiblioteca(Biblioteca[] biblioteca) {

        for (int i = 0; i < biblioteca.length; i++) {
            for (int cont = 0; cont < biblioteca.length; cont++ ) {
                if (biblioteca[i] != null || biblioteca[i].compareTo(biblioteca[cont])> 0) {
                    Biblioteca aux = biblioteca[i];
                    biblioteca[i] = biblioteca[cont];
                    biblioteca[cont] = aux;
                }
            }

        }
    }
*/


}
