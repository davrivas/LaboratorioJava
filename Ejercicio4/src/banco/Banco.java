package banco;

public class Banco {
    private String nombre;
    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco(String nom) {
        this.nombre = nom;
    }

    public String obtNombre() {
        return nombre;
    }
    
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void adCliente(Cliente clie) {}
    
    public int obtNumClientes() {
        return numeroDeClientes;
    }
    
    public Cliente[] obtClientes() {
        return clientes;
    }
}

