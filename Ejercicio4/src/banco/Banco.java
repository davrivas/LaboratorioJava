package banco;

public class Banco {
    private String nombre;
    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco(String nom) {
        this.nombre = nom;
        this.numeroDeClientes = 10;
        this.clientes = new Cliente[numeroDeClientes];
        this.clientes[0] = new Persona("2345", "David Rivas", 23);
        this.clientes[1] = new Empresa("5764", "Rivery", "2348");
        this.clientes[2] = new Persona("876765", "Leonardo Vargas", 21);
        this.clientes[3] = new Empresa("5432726", "Pevaar", "675765");
        this.clientes[4] = new Persona("89676", "Miguel Sanchez", 54);
        this.clientes[5] = new Empresa("7464", "Cementos Argos", "987987");
        this.clientes[6] = new Persona("94387934", "Falcao Garcia", 27);
        this.clientes[7] = new Empresa("84376", "DMG", "67657");
        this.clientes[8] = new Persona("874363", "Santiago Agudelo", 32);
        this.clientes[9] = new Empresa("579873", "Prodigious", "76575");
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
        return this.numeroDeClientes;
    }
    
    public Cliente[] obtClientes() {
        return this.clientes;
    }
}

