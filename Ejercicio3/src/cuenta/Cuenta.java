package cuenta;

public class Cuenta {
    private String numero;
    private String tipo;
    private double saldoActual;
    private double saldoMinimo;
    
    public Cuenta(int numero, String tipo, double valorInicial) {
        this.numero = Integer.toString(numero);
        this.tipo = tipo;
        this.saldoActual = valorInicial;
        this.saldoMinimo = this.saldoActual * 0.10;
    }
    
    public void consignar(double monto) {
        this.saldoActual += monto;
    }
    
    public void retirar(double monto) {
        if (getSaldo() == getSaldoMinimo()) {
            System.out.println("¡No es posible retirar!");
        } else if (monto > (getSaldo()-getSaldoMinimo())) {
            this.saldoActual -= getSaldo()-getSaldoMinimo();
            System.out.println("Solo es posible retirar el monto autorizado");
        } else {
            this.saldoActual -= monto;
        }
    }
    
    public double getSaldo() {
        return this.saldoActual;
    }
    
    public double getSaldoMinimo() {
        return this.saldoMinimo;
    }
    
    public double getCapacidadCredito() {
        double capacidadCredito = 0;
        
        switch (this.tipo) {
            case "ahorro":
                capacidadCredito = getSaldo() - getSaldoMinimo();
                break;
            case "credito":
                capacidadCredito = getSaldo() * 3;
                break;
        }
        
        return capacidadCredito;
    }
}
