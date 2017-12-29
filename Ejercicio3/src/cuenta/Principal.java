package cuenta;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0, tipoInt = 0, menu = 0;
        String tipo = "";
        double valorInicial = 0, monto = 0;
        
        System.out.println("Bienvenido a la cuenta\n");
        
        System.out.println("Digite el número de la cuenta:");
        numero = scanner.nextInt();
        
        do {
            System.out.println(
                "Digite 1 si la cuenta es de ahorro\n" +
                "2 si es de crédito"
            );
            tipoInt = scanner.nextInt();
            if (tipoInt < 1 || tipoInt > 2) {
                System.out.println("¡Opción inválida!");
            }
        } while (tipoInt < 1 || tipoInt > 2);        
        if (tipoInt == 1) {
            tipo = "ahorro";
        } else {
            tipo = "credito";
        }
        
        do {
            System.out.println("Digite el valor inicial de la cuenta:");
            valorInicial = scanner.nextDouble();
            if (valorInicial < 10) {
                System.out.println("¡El valor inicial no debe ser menor a $10!");
            }
        } while (valorInicial < 10);
        
        Cuenta cuenta = new Cuenta(numero, tipo, valorInicial);
        System.out.println("\n\n");
        
        while (true) {
            System.out.println("Saldo actual: $" + cuenta.getSaldo() + "\n");
            
            System.out.println(
                "Digite 1 consignar\n" +
                "2 para retirar\n" +
                "3 para ver el saldo mínimo\n" +
                "4 para ver la capacidad del crédito\n" +
                "Otro número para salir"
            );
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("Digite la cantidad a consignar:");
                    monto = scanner.nextDouble();
                    cuenta.consignar(monto);
                    break;
                case 2:
                    System.out.println("Digite la cantidad a retirar:");
                    monto = scanner.nextDouble();
                    cuenta.retirar(monto);
                    break;
                case 3:
                    System.out.println("Saldo mínimo: $" + cuenta.getSaldoMinimo());
                    break;
                case 4:
                    System.out.println("Capacidad del crédito: $" + cuenta.getCapacidadCredito());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
