package banco;

public class Empresa extends Cliente {
    private String nit;
    private String representante;
    
    public Empresa(String nit, String nom, String r) {
        super(nom);
        this.nit = nit;
        this.representante = r;
    }

    @Override
    public String obtIdentificacion() {
        return nit;
    }
    
    public String obtRepresentante() {
        return representante;
    }
    
    public String cambiarRepres(String repres) {
        this.representante = repres;
        return representante;
    }
}

