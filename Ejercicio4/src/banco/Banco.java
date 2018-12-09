package banco;

public class Banco {
    private String nombre;
    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco(String nom) {
        this.nombre = nom;
        this.clientes = new Cliente[100];
        this.clientes[0] = new Persona("2345", "David Rivas", 12);
        this.clientes[1] = new Empresa("sddf2345", "Rivery", "234");
    }

    public String obtNombre() {
        return this.nombre;
    }
    
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void adCliente(Cliente clie) {
        this.clientes[++this.numeroDeClientes] = clie;
    }
    
    public int obtNumClientes() {
        if (clientes.length == 0)
            this.numeroDeClientes = 0;
        else
            this.numeroDeClientes = clientes.length;
        
        return this.numeroDeClientes;
    }
    
    public Cliente[] obtClientes() {
        return this.clientes;
    }
}

