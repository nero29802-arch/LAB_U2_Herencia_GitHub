
package LABU2HerenciaGitHub;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Tesis extends Material {
    
    private String autor;
    private String universidad;
    private int anioPublicacion;

    public Tesis(String titulo, String autor, String universidad, int anioPublicacion) {
        super(titulo);
        
        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getUniversidad() {
        return universidad;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    @Override
    public void mostrarInfo(){
        
        super.mostrarInfo();
        
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año de publicacion: " + anioPublicacion);
    }
    
    
    

}
