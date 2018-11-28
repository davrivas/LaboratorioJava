package banco;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Banco banco = new Banco("del pueblo");
        Scanner scanner = new Scanner(System.in);
        int menu, cont;

        System.out.println("Bienvenido al banco" + banco.obtNombre() + "\n");

        while (true) {
            cont = 1;
            
            System.out.println("Digite");
            System.out.println("1. Para obtener todos los nombres de los clientes que tiene el banco");
            System.out.println("2. Para obtener todas los nombres y cédulas de las personas clientes del banco");
            System.out.println("3. Para obtener el nombre y representante de cada Empresa");
            System.out.println("4. Para obtener nombres de los clientes menores de edad");
            System.out.println("5. Para obtener el nombre y la edad del cliente más Joven");
            System.out.println("6. Para obtener el nombre y la edad del cliente más viejo");
            System.out.println("Otro número para salir");
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    for (Cliente cliente : banco.obtClientes()) {
                        System.out.println(cont + ": " + cliente.obtNombre());
                        cont++;
                    }
                    break;
                case 2:
                    for (Cliente cliente : banco.obtClientes()) {
                        if ("Persona".equals(cliente.getClass().toString())) {
                            System.out.println(cont + ": Es persona");
                        } else {
                            System.out.println(cont + ": Es empresa");
                        }
                        cont++;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.exit(0);
                    break;
            }
            
            System.out.println("");
        }
    }
}
