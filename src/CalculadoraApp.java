import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Aplicacion Calculadora! ***");
        
        while (true) {
            mostrarMenu();
            try {
                System.out.print("Operacion a realizar: ");
                int operacion = consola.nextInt();
                ejecutarOperacion(operacion, consola);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
                consola.nextLine(); // limpiar buffer
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                """);
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        if (operacion >= 1 && operacion <= 4) {
            System.out.print("Ingrese el primer operando: ");
            int operando1 = consola.nextInt();
            System.out.print("Ingrese el segundo operando: ");
            int operando2 = consola.nextInt();
            int resultado;

            switch (operacion) {
                case 1 -> {
                    resultado = operando1 + operando2;
                    System.out.println("El resultado de la suma es: " + resultado);
                }
                case 2 -> {
                    resultado = operando1 - operando2;
                    System.out.println("El resultado de la resta es: " + resultado);
                }
                case 3 -> {
                    resultado = operando1 * operando2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                }
                case 4 -> {
                    if (operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                }
            }
        } else if (operacion == 5) {
            System.out.println("Hasta luego!");
            System.exit(0); // salir del programa
        } else {
            System.out.println("Opción no válida. Ingrese un número entre 1 y 5.");
        }
        System.out.println(); // espacio visual
    }
}
