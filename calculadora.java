import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Básica - SUMA");
        System.out.print("Ingrese el primer número:  ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 + numero2;
        System.out.println("La solución de la suma es: " + resultado);

        System.out.println("Calculadora Básica - Resta");
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);


        System.out.println("Calculadora Básica - Multiplicacion");
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);

 System.out.println("Calculadora Básica - Division");
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 / numero2;
        System.out.println("El resultado de la division es: " + resultado);


        scanner.close();
    }
}
