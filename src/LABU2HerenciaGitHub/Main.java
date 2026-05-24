/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABU2HerenciaGitHub;

/**
 *
 * @author pserr
 */
import java.util.Scanner;

// Clase principal donde se ejecuta el sistema
public class Main {

    // Método principal del programa
    public static void main(String[] args) {

        // Scanner para leer datos desde teclado
        Scanner sc = new Scanner(System.in);

        // Se crea un objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Variable para guardar la opcion del menu
        int opcion;

        // Ciclo do-while para mantener el menu activo
        do {

            // Menu principal
            System.out.println("\n---- MENU ----");
            System.out.println("1- Agregar libro");
            System.out.println("2- Agregar revista");
            System.out.println("3- Agregar tesis");
            System.out.println("4- Agregar audiolibro");
            System.out.println("5- Listar materiales");
            System.out.println("6- Buscar material por ID");
            System.out.println("7- Prestar material");
            System.out.println("8- Devolver material");
            System.out.println("9- Mostrar total de materiales");
            System.out.println("10- Salir");

            System.out.print("Seleccione una opcion: ");

            // Validacion para evitar errores si el usuario escribe texto
            while (!sc.hasNextInt()) {

                System.out.println("Ingrese un numero valido");
                sc.next();
            }

            // Guarda la opcion seleccionada
            opcion = sc.nextInt();
            sc.nextLine();

            // Switch para ejecutar cada opcion del menu
            switch(opcion) {

                // Agregar libro
                case 1:

                    // Solicita datos del libro
                    System.out.print("Titulo del libro: ");
                    String tituloLibro = sc.nextLine();

                    System.out.print("Autor: ");
                    String autorLibro = sc.nextLine();

                    System.out.print("Cantidad de paginas: ");
                    int paginas = sc.nextInt();
                    sc.nextLine();

                    // Crea objeto libro
                    Libro libro = new Libro(
                            tituloLibro,
                            autorLibro,
                            paginas,
                            Genero.Programacion
                    );

                    // Agrega el libro a la biblioteca
                    biblioteca.agregarMaterial(libro);

                    break;

                // Agregar revista
                case 2:

                    // Solicita datos de la revista
                    System.out.print("Titulo de la revista: ");
                    String tituloRevista = sc.nextLine();

                    System.out.print("Numero de edicion: ");
                    int numeroEdicion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Mes de publicacion: ");
                    String mes = sc.nextLine();

                    // Crea objeto revista
                    Revista revista = new Revista(
                            tituloRevista,
                            numeroEdicion,
                            mes
                    );

                    // Agrega la revista
                    biblioteca.agregarMaterial(revista);

                    break;

                // Agregar tesis
                case 3:

                    // Solicita datos de la tesis
                    System.out.print("Titulo de la tesis: ");
                    String tituloTesis = sc.nextLine();

                    System.out.print("Autor: ");
                    String autorTesis = sc.nextLine();

                    System.out.print("Universidad: ");
                    String universidad = sc.nextLine();

                    System.out.print("Año de publicacion: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    // Crea objeto tesis
                    Tesis tesis = new Tesis(
                            tituloTesis,
                            autorTesis,
                            universidad,
                            anio
                    );

                    // Agrega la tesis
                    biblioteca.agregarMaterial(tesis);

                    break;

                // Agregar audiolibro
                case 4:

                    // Solicita datos del audiolibro
                    System.out.print("Titulo del audiolibro: ");
                    String tituloAudio = sc.nextLine();

                    System.out.print("Narrador: ");
                    String narrador = sc.nextLine();

                    System.out.print("Duracion en minutos: ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    // Crea objeto audiolibro
                    AudioLibro audioLibro = new AudioLibro(
                            tituloAudio,
                            narrador,
                            duracion
                    );

                    // Agrega el audiolibro
                    biblioteca.agregarMaterial(audioLibro);

                    break;

                // Listar todos los materiales
                case 5:

                    biblioteca.listarMateriales();

                    break;

                // Buscar material por ID
                case 6:

                    System.out.print("Ingrese el ID: ");
                    int idBuscar = sc.nextInt();

                    // Busca el material
                    Material encontrado =
                            biblioteca.buscarPorId(idBuscar);

                    // Verifica si existe
                    if(encontrado != null) {

                        encontrado.mostrarInfo();

                    } else {

                        System.out.println("Material no encontrado");
                    }

                    break;

                // Prestar material
                case 7:

                    System.out.print("Ingrese el ID del material: ");
                    int idPrestamo = sc.nextInt();

                    biblioteca.prestarMaterial(idPrestamo);

                    break;

                // Devolver material
                case 8:

                    System.out.print("Ingrese el ID del material: ");
                    int idDevolver = sc.nextInt();

                    biblioteca.devolverMaterial(idDevolver);

                    break;

                // Mostrar cantidad total de materiales
                case 9:

                    biblioteca.mostrarTotalMateriales();

                    break;

                // Salir del programa
                case 0:

                    System.out.println("Saliendo del sistema...");

                    break;

                // Opcion invalida
                default:

                    System.out.println("Opcion invalida");
            }

        // El menu se repite mientras la opcion sea diferente de 0
        } while(opcion != 0);

        // Cierra el Scanner
        sc.close();
    }
}
