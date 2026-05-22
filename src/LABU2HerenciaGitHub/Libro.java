/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABU2HerenciaGitHub;

/**
 *
 * @author HP
 */
// Subclase Libro que hereda de la superclase abstracta Material
public class Libro extends Material {

    // Atributos propios de Libro
    private String autor;
    private int cantidadPaginas;
    private Genero genero; // Usa el enum Genero

    // Constructor que utiliza super para inicializar los atributos heredados
    public Libro(String titulo, String autor, int cantidadPaginas, Genero genero) {
        super(titulo); // Llama al constructor de Material
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.genero = genero;
    }

    // Getters
    public String getAutor() {
        return autor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    // Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Sobrescritura del metodo mostrarInfo() de la superclase
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Muestra la info base de Material
        System.out.println("Tipo      : Libro");
        System.out.println("Autor     : " + autor);
        System.out.println("Paginas   : " + cantidadPaginas);
        System.out.println("Genero    : " + genero);
        System.out.println("---------------------------");
    }
}