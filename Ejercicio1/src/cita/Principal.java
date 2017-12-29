package cita;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0, tipo = 0;
        double tarifa = 0;
        
        System.out.println("Bienvenido a la creación de la cita.\n");
        
        System.out.println("Digite el número de la cita:");
        numero = scanner.nextInt();
        
        System.out.println("Digite el tipo de cita:");
        do {
            System.out.println(
                "1, 2 o 3 para general\n" +
                "4 o 5 para especialista"
            );
            tipo = scanner.nextInt();
            
            if (tipo < 1 || tipo > 5) {
                System.out.println("¡Opción inválida!");
                System.out.println("Digite de nuevo el tipo de cita:");
            }
        } while (tipo < 1 || tipo > 5);
        
        
        System.out.println("Digite la tarifa de la cita");
        tarifa = scanner.nextDouble();
        
        Cita cita = new Cita(numero, tipo, tarifa);
        
        System.out.println(
            "El número de la cita es: " + cita.getNumero() + "\n" +
            "Esta cita es de tipo: " + cita.getTipo() + "\n" +
            "Su tarifa normal es: $" + cita.getTarifa() + "\n" +
            "Pero por ser de tipo " + cita.getTipo() + " queda con un valor "
                + "final de $" + cita.calcularValorFinal()
        );
    }
}
