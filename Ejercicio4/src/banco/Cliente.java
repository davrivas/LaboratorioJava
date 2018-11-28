
package banco;

public abstract class Cliente {
    private String nombre;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtNombre() {
        return this.nombre;
    }
    
    public abstract String obtIdentificacion();
}

