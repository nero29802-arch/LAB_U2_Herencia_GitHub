// Se deja documentado todo 
//lo que se pueda para no
//batear que se lo que hace. 

package LABU2HerenciaGitHub;

 //Atributos privados o encapsulados
public  class Material { 
    private String titulo;
    private boolean disponible;
    private static int contadorMateriales = 0;
    private final int id;
    
    
    // Conturtor para analizar los atributos 
    public Material(String titulo) {
        contadorMateriales++;
        this.id = contadorMateriales;
        this.titulo = titulo;
        this.disponible = true;   // Por defecto el material esta disponible
    }
    
    // -------- Getters ------ 
    
    // Retorna el ID único del material no lleva setter es final
    
    public int getId() {
        return id;
    }
    
    // retorna titulo de la materia 
    
    public String getTitulo() {
        return titulo;
    }
    
    
    // Retorna si el material esta disponble para el préstamo.
    
    public boolean isDisponible() {
        return disponible;
    }
    
    // Retorna la cantidad de materiales creados
    public static int getContadorMateriales() {
        return contadorMateriales;
    }
    
    
    // ----- Setter ----
    
    // Actuliza el titulo del materai
    
    public void settitulo(String titulo) {
        this.titulo = titulo;
        
    }
    
    // Cambia el estado de disponibilidad 
    
    protected void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    // MEtodos
    
    //Registra la prestamo del material.
     //Valida que el material haya sido prestado previamente.
    
    public void prestar() {
        if (disponible) {
            disponible = false;
             System.out.println(" Material \"" + titulo + "\" prestado exitosamente.");
        } else {
              System.out.println(" El material \"" + titulo + "\" no está disponible actualmente.");
        }
    }
    
     //Registra la devolucion del material.
     //Valida que el material haya sido prestado previamente.
    
    public void devolver() {
        if (!disponible) {
            disponible = true;
             System.out.println(" Material \"" + titulo + "\" devuelto exitosamente.");
        } else {
             System.out.println(" El material \"" + titulo + "\" no había sido prestado.");
        }
    }
    
    /**
     * Muestra la información básica del material.
     *
     * Las subclases DEBEN sobrescribir este método con @Override
     * para mostrar sus atributos propios, llamando a super.mostrarInfo()
     * al inicio para incluir la información base.
     */
    
    public void mostrarInfo() {
        System.out.println("ID  :" + id);
        System.out.println("Titulo :" + titulo);
        System.out.println("Estado :" + (disponible ? "Disponible" : "Prestado"));
    }
}