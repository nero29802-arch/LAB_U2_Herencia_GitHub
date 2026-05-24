/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABU2HerenciaGitHub;

/**
 *
 * @author pserr
 */
import java.util.ArrayList;

// Clase Biblioteca encargada de administrar los materiales
public class Biblioteca {

    // ArrayList donde se almacenan todos los materiales
    private ArrayList<Material> materiales;

    // Constructor 
    public Biblioteca() {

        // Inicializa la lista de materiales
        materiales = new ArrayList<>();
    }

    // Metodo 
    public void agregarMaterial(Material material) {

        // Agrega el material al ArrayList
        materiales.add(material);

        System.out.println("Material agregado correctamente");
    }

    // Metodo
    public void listarMateriales() {

        // Verifica si la lista esta vacia
        if(materiales.isEmpty()) {

            System.out.println("No hay materiales registrados");
            return;
        }

        // Recorre todos los materiales usando polimorfismo
        for(Material material : materiales) {

            // Muestra la informacion de cada material
            material.mostrarInfo();

            System.out.println("-------------------");
        }
    }

    // Metodo
    public Material buscarPorId(int id) {

        // Recorre la lista de materiales
        for(Material material : materiales) {

            // Compara el ID ingresado con el ID del material
            if(material.getId() == id) {

                return material;
            }
        }

        // Retorna null si no encuentra el material
        return null;
    }

    // Metodo
    public Material buscarPorTitulo(String titulo) {

        // Recorre la lista de materiales
        for(Material material : materiales) {

            // Compara el titulo ignorando mayusculas y minusculas
            if(material.getTitulo().equalsIgnoreCase(titulo)) {

                return material;
            }
        }

        // Retorna null si no encuentra el material
        return null;
    }

    // Metodo
    public void prestarMaterial(int id) {

        // Busca el material utilizando el ID
        Material material = buscarPorId(id);

        // Verifica si el material existe
        if(material != null) {

            // Ejecuta el metodo prestar del material
            material.prestar();

        } else {

            System.out.println("Material no encontrado");
        }
    }

    // Metodo
    public void devolverMaterial(int id) {

        // Busca el material por ID
        Material material = buscarPorId(id);

        // Verifica si el material existe
        if(material != null) {

            // Ejecuta el metodo devolver
            material.devolver();

        } else {

            System.out.println("Material no encontrado");
        }
    }

    // Metodo
    public void mostrarTotalMateriales() {

        System.out.println("Total de materiales registrados: "
                + Material.getContadorMateriales());
    }
}