package banco;

public class Banco {
    private String nombre;
    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco(String nom) {
        this.nombre = nom;
        this.clientes = new Cliente[100];
        this.numeroDeClientes = -1;
        this.clientes[0] = new Persona("2345", "David Rivas", 12);
        this.clientes[1] = new Empresa("sddf2345", "Rivery", "234");
    }

    public String obtNombre() {
        return nombre;
    }
    
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void adCliente(Cliente clie) {
        clientes[++numeroDeClientes] = clie;
    }
    
    public int obtNumClientes() {
        return numeroDeClientes;
    }
    
    public Cliente[] obtClientes() {
        return clientes;
    }
}

