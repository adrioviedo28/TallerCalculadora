import java.util.Scanner;

public class Calculadora {

    // Constructor de la clase Calculadora
    public Calculadora() {
        // El constructor puede estar vacío si no es necesario inicializar nada
    }

    // Método para sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(double a, double b) {
        // Verificar si el divisor es 0 para evitar la división por cero
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }

    // Método principal para probar la calculadora
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la clase Calculadora
        Calculadora calcu = new Calculadora();

        // Leer los dos números del usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Leer la operación deseada del usuario
        System.out.println("| Seleccione una operación        |");
        System.out.println("| 1. Suma                         |");
        System.out.println("| 2. Resta                        |");
        System.out.println("| 3. Multiplicación               |");
        System.out.println("| 4. División                     |");
        System.out.print("Ingrese el número de la operacion:   ");
        int opcion = scanner.nextInt();

        // Ejecutar la operación seleccionada
        try {
            double resultado;
            switch (opcion) {
                case 1:
                    resultado = calcu.sumar(num1, num2);
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = calcu.restar(num1, num2);
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = calcu.multiplicar(num1, num2);
                    System.out.println("Resultado de la multiplicación: " + resultado);
                    break;
                case 4:
                    resultado = calcu.dividir(num1, num2);
                    System.out.println("Resultado de la división: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Cerrar el escáner
        scanner.close();
    }
}

