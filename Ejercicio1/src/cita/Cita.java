package cita;

public class Cita {
    private int numero;
    private int tipo;
    private double tarifa;
    private double valorFinal;
    
    public Cita(int numero, int tipo, double tarifa) {
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;                
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public String getTipo() {
        String tipoCita = "";
        
        switch(this.tipo) {
            case 1:
            case 2:
            case 3:
                tipoCita = "general";
                break;
            
            case 4:
            case 5:
                tipoCita = "especialista";
                break;
        }
        
        return tipoCita;
    }
    
    public double getTarifa() {
        return this.tarifa;
    }
    
    public double calcularValorFinal() {
        double valorFinal = getTarifa();
        
        switch (getTipo()) {
            case "especialista":
                valorFinal += (valorFinal * 0.5);
                break;
            
            case "general":
                valorFinal -= (valorFinal * 0.5);
                break;
        }
        
        return valorFinal;
    }
}
