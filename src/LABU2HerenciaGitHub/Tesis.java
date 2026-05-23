
package LABU2HerenciaGitHub;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
    

//Esta es la subclase tesis heredada con extends de la clase material
public class Tesis extends Material {
    
    // estos son los atributos privados de la subclase Tesis
    private String autor;
    private String universidad;
    private int anioPublicacion;


    //metodo constructor de la subclase Tesis
    public Tesis(String titulo, String autor, String universidad, int anioPublicacion) {
        
        //llamado del constructor de la clase material con super
        super(titulo);
        
        //da inicio a los atributos de la subclase tesis
        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
    }


    //getters de autor, universidad y año de publicacion 
    public String getAutor() {
        return autor;
    }

    public String getUniversidad() {
        return universidad;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }


    //setters de autor, universidad y año de publicacion 
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
  
    // sobrescritura del método mostrarInfo de la clase material
    @Override
    public void mostrarInfo(){
        
        //Llamado de mostrarInfo de la clase material
        super.mostrarInfo();
        
        //muestra la informacion de la clase tesis
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año de publicacion: " + anioPublicacion);
    }
    
}