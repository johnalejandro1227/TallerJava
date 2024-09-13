package Class;

import Interfaces.Gestionable;
import base.Persona;

public class Bibliotecario extends Persona implements Gestionable {

    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());
    }
    @Override
    public void prestarLibro(Usuario usuario, Libro libro) {
        if (usuario.librosPermitidos.size() > 3) {
            System.out.println("Maximo de libros permitidos");
        } else {
            libro.prestar();
            usuario.librosPermitidos.add(libro);
            System.out.println("usuario: " + usuario.getNombre() + " " + usuario.getApellido() + "  presto el libro "
                    + libro.getTitulo());
        }

    }

    @Override
    public void devolverLibro(Usuario usuario, Libro libro) {
        usuario.librosPermitidos.remove(libro.getIsbn());
        System.out.println("el usuario ha devuelto el libro: "+libro.getTitulo());
    }
}