package banco;

public class Persona extends Cliente {
    private String cedula;
    private int edad;

    public Persona(String ced, String nom, int ed) {
        super(nom);
        this.cedula = ced;
        this.edad = ed;
    }

    @Override
    public String obtIdentificacion() {
        return cedula;
    }
    
    public String obtEdad() {
        return edad + " años";
    }
    
    public void cumplirAños() {}
}

