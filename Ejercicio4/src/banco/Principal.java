package banco;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el nombre del banco");
        final String nombreBanco = scanner.nextLine();

        final Banco banco = new Banco(nombreBanco);
        
        System.out.println("\nBienvenido al banco " + banco.obtNombre() + "\n");
        
        final Cliente[] clientes = banco.obtClientes();

        while (true) {
            int contador = 1;
            
            System.out.println("Digite");
            System.out.println("1. Para obtener todos los nombres de los clientes que tiene el banco");
            System.out.println("2. Para obtener todas los nombres y cédulas de las personas clientes del banco");
            System.out.println("3. Para obtener el nombre y representante de cada Empresa");
            System.out.println("4. Para obtener nombres de los clientes menores de edad");
            System.out.println("5. Para obtener el nombre y la edad del cliente más Joven");
            System.out.println("6. Para obtener el nombre y la edad del cliente más viejo");
            System.out.println("Otro número para salir");
            final int menu = scanner.nextInt();
            
            System.out.println("");
            
            switch (menu) {
                case 1:
                    for (Cliente cliente : clientes) {
                        System.out.println(contador + ": " + cliente.obtNombre());
                        contador++;
                    }
                    break;
                case 2:
                    for (Cliente cliente : clientes) {
                        if (cliente instanceof Empresa)
                            continue;
                        
                        System.out.println("Persona cliente " + contador);
                        System.out.println("Nombre: " + cliente.obtNombre());
                        System.out.println("Cedula: " + cliente.obtIdentificacion());
                        contador++;
                    }
                    break;
                case 3:
                    for (Cliente cliente : clientes) {
                        if (cliente instanceof Persona)
                            continue;
                        
                        Empresa empresa = (Empresa) cliente;
                        System.out.println("Empresa cliente " + contador);
                        System.out.println("Nombre: " + empresa.obtNombre());
                        System.out.println("Representante: " + empresa.obtRepresentante());
                        contador++;
                    }
                    break;
                case 4:
                    for (Cliente cliente : clientes) {
                        if (cliente instanceof Empresa)
                            continue;
                        
                        final Persona persona = (Persona) cliente;
                        int edad = Integer.parseInt(persona.obtEdad());
                        
                        if (edad >= 18)
                            continue;
                        
                        System.out.println("Cliente menor de edad " + contador);
                        System.out.println("Nombre: " + persona.obtNombre());
                        System.out.println("Cedula: " + cliente.obtIdentificacion());
                        contador++;
                    }
                    break;
                case 5:
                    int menor = Integer.MAX_VALUE;
                    Persona clienteMasJoven = null;
                    
                    for (Cliente cliente : clientes) {
                        if (cliente instanceof Empresa)
                            continue;
                        
                        Persona persona = (Persona) cliente;
                        int edad = Integer.parseInt(persona.obtEdad());
                        
                        if (edad < menor) {
                            menor = edad;
                            clienteMasJoven = persona;
                        }
                    }
                    
                    System.out.println("Cliente más joven:");
                    System.out.println("Nombre: " + clienteMasJoven.obtNombre());
                    System.out.println("Edad: " + clienteMasJoven.obtEdad());
                    break;
                case 6:
                    int mayor = Integer.MIN_VALUE;
                    Persona clienteMasViejo = null;
                    
                    for (Cliente cliente : clientes) {
                        if (cliente instanceof Empresa)
                            continue;
                        
                        Persona persona = (Persona) cliente;
                        int edad = Integer.parseInt(persona.obtEdad());
                        
                        if (edad > mayor){
                            mayor = edad;
                            clienteMasViejo = persona;
                        }
                    }
                    
                    System.out.println("Cliente más joven:");
                    System.out.println("Nombre: " + clienteMasViejo.obtNombre());
                    System.out.println("Edad: " + clienteMasViejo.obtEdad());
                    break;
                default:
                    System.exit(0);
                    break;
            }
            
            System.out.println("");
        }
    }
}
