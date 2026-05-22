
package LABU2HerenciaGitHub;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class AudioLibro extends Material {
    
    private String narrador;
    private int duracionMinutos;


     public AudioLibro(String titulo, String narrador, int duracionMinutos) {

        super(titulo);
        
        this.narrador = narrador;
        this.duracionMinutos = duracionMinutos;
    }

    public String getNarrador() {
        return narrador;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    @Override
    public void mostrarInfo(){
        
        super.mostrarInfo();
        
        System.out.println("Narrador: " + narrador);
        System.out.println("DuracionMinutos " + duracionMinutos);
    }
        
}
