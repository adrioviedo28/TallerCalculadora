import java.util.Scanner;

public class Calculadora {

    // el public Calculadora es el Constructor de la clase Calculadora
    public Calculadora() {
    }

    // siguiente es el Método para sumar dos números.
    // "Double" :es un tipo de dato primitivo que se usa para representar números en coma flotante,
    // es decir, números que pueden tener una parte decimal
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
        // Verificar si el divisor es 0 para evitar la división por cero,
        //se usa para manejar de manera controlada la situación en la que se intenta
       // realizar una división por cero. La división por cero es una operación matemática indefinida
        // y puede causar problemas en la ejecución del programa
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }

    // Usar la Clase en el Método Principal para probar la calculadora.
    // método main para probar la clase Calculadora.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la clase Calculadora
        //Calculadora calc = new Calculadora(); crea un nuevo objeto de la clase Calculadora
        Calculadora calcu = new Calculadora();

        // Leer los dos números del usuario
        //se usa scaner para  leer la entrada del usuario y Se solicita al usuario que ingrese
        // dos números (num1 y num2).
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
        //Se utiliza un switch para manejar las diferentes operaciones
        // y un try-catch para capturar cualquier excepción, como la división por cero
        //try es una palabra clave utilizada en el manejo de excepciones. Permite manejar errores de
        // forma controlada y prevenir que un programa se detenga abruptamente si ocurre una
        // excepción durante su ejecución
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

