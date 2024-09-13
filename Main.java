import Class.Libro;
import Class.Bibliotecario;
import Class.Usuario;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        List<Libro> listaDeLibros = new ArrayList<>();


        //crear libros
        Libro libro1= new Libro( "Persona favorita", "mariam rojas", 1, true );
        Libro libro2 = new Libro("Habitos atomicos", "Antoine de Saint-Exupéry", 2, true);

        listaDeLibros.add(libro1);
        listaDeLibros.add(libro2);
        System.out.println(" el numero de libros es " + listaDeLibros.size());

        // Crear usuario
        Usuario usuario = new Usuario("pedro", "Diaz");

        // Crear bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Gabriel", "Perez");

        // Mostrar datos
        usuario.mostrarDatos();bibliotecario.mostrarDatos();

        // Prestar libros
        bibliotecario.prestarLibro(usuario, libro1);
        bibliotecario.prestarLibro(usuario, libro2);

        // Devolver libro
        bibliotecario.devolverLibro(usuario, libro1);

    }
}
