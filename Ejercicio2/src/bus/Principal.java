package bus;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String placa = "";
        int capacidad = 0, menu = 0, pasajeros = 0;
        double pasaje = 0;
        
        System.out.println("Bienvenido al bus");
        
        System.out.println("Digite la placa del bus:");
        placa = scanner.nextLine();
        
        System.out.println("Digite la capacidad de pasajeros del bus:");
        do {
            capacidad = scanner.nextInt();
            scanner.nextLine();
            if (capacidad < 1) {
                System.out.println("¡Cantidad inválida!");
                System.out.println("Digite de nuevo la capacidad de pasajeros "
                        + "del bus:");
            }
        } while (capacidad < 1);
        
        
        System.out.println("Digite el precio del pasaje:");
        pasaje = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("");
        
        Bus bus = new Bus(placa, capacidad, pasaje);
        
        System.out.println("Placa: " + bus.getPlaca());
        System.out.println("Capacidad: " + bus.getCapacidad());
        System.out.println("Valor del pasaje: $" + bus.getPrecioPasaje());
        
        while (true) {
            System.out.println("Pasajeros actuales: " + 
                    bus.getPasajerosActuales());
            System.out.println("Digite las opciones:");
            System.out.println(
                "1 Para mostrar los datos del bus\n" +
                "2 Para mostrar pasajeros totales que se han subido al "
                        + "bus\n" +
                "3 Para subir pasajeros\n" +
                "4 Para bajar pasajeros\n" +
                "5 Para mostrar el dinero acumulado\n" + 
                "Otro número para salir"
            );
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("Placa: " + bus.getPlaca());
                    System.out.println("Precio del pasaje: " + bus.getPrecioPasaje());
                    break;
                case 2:
                    System.out.println("Pasajeros totales que se han subido al "
                            + "bus: " + bus.getPasajerosTotales());
                    break;
                case 3:
                    System.out.println("Digite la cantidad de pasajeros a "
                            + "subir:");
                    pasajeros = scanner.nextInt();
                    bus.subirPasajeros(pasajeros);
                    break;
                case 4:
                    System.out.println("Digite la cantidad de pasajeros a "
                            + "bajar:");
                    pasajeros = scanner.nextInt();
                    bus.bajarPasajeros(pasajeros);
                    break;
                case 5:
                    System.out.println("Dinero acumulado: $" + 
                            bus.getDineroAcumulado());
                    break;
                default:
                    System.exit(0);
            }
            
            System.out.println("");
        }
    }
}
