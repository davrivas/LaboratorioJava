package bus;

public class Bus {
    private String placa;
    private int capacidadPasajeros;
    private double precioPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;
    
    public Bus(String placa, int capacidad, double pasaje) {
        this.placa = placa;
        this.capacidadPasajeros = capacidad;
        this.precioPasaje = pasaje;
        this.pasajerosActuales = 0;
        this.totalPasajeros = 0;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public int getCapacidad() {
        return this.capacidadPasajeros;
    }
    
    public double getPrecioPasaje() {
        return this.precioPasaje;
    }
    
    public int getPasajerosActuales() {
        return this.pasajerosActuales;
    }
    
    public int getPasajerosTotales() {
        return this.totalPasajeros;
    }
    
    public void subirPasajeros(int pasajeros) {
        if (getPasajerosActuales() == getCapacidad() || 
                pasajeros > (getCapacidad()-getPasajerosActuales())) {
            System.out.println("No es posible subir más pasajeros");
        } else {
            this.pasajerosActuales += pasajeros;
            this.totalPasajeros += pasajeros;
        }
    }
    
    public void bajarPasajeros(int pasajeros) {
        if (getPasajerosActuales() == 0 || pasajeros == (getPasajerosActuales()+1)) {
            System.out.println("No es posible bajar más pasajeros");
        } else {
            this.pasajerosActuales -= pasajeros;
        }
    }
    
    public double getDineroAcumulado() {
        return getPasajerosTotales() * getPrecioPasaje();
    }
}
