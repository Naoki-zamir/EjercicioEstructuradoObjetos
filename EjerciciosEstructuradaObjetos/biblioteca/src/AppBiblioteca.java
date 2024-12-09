import com.biblioteca.mantener.*;
import java.util.Scanner;

public class AppBiblioteca {
    Libro libro;
    public static void main(String[] args) throws Exception {
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargarLibro();
        appBiblioteca.imprimir();


    }

    public void cargarLibro(){
        libro = new Libro();
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese el codigo del libro: ");
        libro.setCodigo(sc.nextInt());

        System.out.println("Ingrese el nombre del libro: ");
        sc.nextLine();
        libro.setNombre(sc.nextLine());
      
        System.out.println("Ingrese el numero de la edicion: ");
        libro.setEdicion(sc.nextInt());

        System.out.println("Ingrese el año de publicacion: ");
        libro.setAñoPublicacion(sc.nextInt());
        

        Autor autor= new Autor();
        System.out.println("Ingrese el Codigo del autor: ");
        autor.setCodigo(sc.nextInt());

        System.out.println("Ingrese el nombre del autor: ");
        autor.setNombre(sc.next());
        sc.nextLine();

        System.out.println(" ingrese los libros publicados ");
        autor.setLibrosPublicados(sc.nextInt());

        Pais pais = new Pais();
        System.out.println("Ingrese el pais del autor"); 
        pais.setPais(sc.next());
        sc.nextLine();

        System.out.println("Ingrese observaciones del libro");
        autor.setObservacion(sc.nextLine());




        libro.setAutor(autor);
    }

    public void imprimir(){
        System.out.println(libro);

    }
}
