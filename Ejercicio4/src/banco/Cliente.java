
package banco;

public abstract class Cliente {
    private String nombre;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtNombre() {
        return nombre;
    }
    
    public abstract String obtIdentificacion();
}

