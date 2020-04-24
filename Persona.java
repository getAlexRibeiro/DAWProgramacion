package Personas;


// No tenia la clase persona
public class Persona {

    // atributos de la clase persona
    private String nombre;
    private String apellidos;

    // constructor por defecto de la clase persona
    public Persona() {

    }

    // constructor de la clase persona que recibe por parametro nombre y apellidos
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //constructor copia de la clase persona
    public Persona(Persona copia) {
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
    }

    // no pongo getters y setters porque no los voy a usar en esta práctica


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // metodo toString de la clase persona para devolver los datos de una persona
    public String toString() {

        return nombre + ", " + apellidos;
    }


}

