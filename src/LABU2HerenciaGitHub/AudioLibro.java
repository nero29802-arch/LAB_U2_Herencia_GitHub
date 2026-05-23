
package LABU2HerenciaGitHub;


import LABU2HerenciaGitHub.Material;


/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

//Esta es la subclase AudioLibro heredada con extends de la clase material 
public class AudioLibro extends Material { 
    

    // estos son los atributos privados de la subclase AudioLibro
    private String narrador;
    private int duracionMinutos;
    

     // Constructor de la clase AudioLibro
     public AudioLibro(String titulo, String narrador, int duracionMinutos) {
    
        //llamado del constructor de la clase material con super
        super(titulo);
        
        //da inicio a los atributos de la clase AudioLibro
        this.narrador = narrador;
        this.duracionMinutos = duracionMinutos;
    }


    //getters de narrador y duracionMinutos

    public String getNarrador() {
        return narrador;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    //setters narrador y duracionMinutos
 
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    // sobrescritura del método mostrarInfo de la clase material
    @Override
    public void mostrarInfo(){
        
        //Llamado de mostrarInfo de la clase material
        super.mostrarInfo();
        
        //muestra la informacion de la claseAudioLibro

        System.out.println("Narrador: " + narrador);
        System.out.println("DuracionMinutos " + duracionMinutos);
    }
}
        

