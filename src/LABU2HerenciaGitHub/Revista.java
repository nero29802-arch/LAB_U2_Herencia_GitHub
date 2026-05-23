/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABU2HerenciaGitHub;

/**
 *
 * @author HP
 */
// Subclase Revista que hereda de la superclase abstracta Material
public class Revista extends Material {

    // Atributos propios de Revista
    private int numeroEdicion;
    private String mesPublicacion;

    // Constructor que utiliza super para inicializar los atributos heredados
    public Revista(String titulo, int numeroEdicion, String mesPublicacion) {
        super(titulo); // Llama al constructor de Material
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    // Getters
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    // Setters
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    // Sobrescritura del metodo mostrarInfo() de la superclase
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Muestra la info base de Material
        System.out.println("Tipo      : Revista");
        System.out.println("Edicion   : " + numeroEdicion);
        System.out.println("Mes       : " + mesPublicacion);
        System.out.println("---------------------------");
    }
}