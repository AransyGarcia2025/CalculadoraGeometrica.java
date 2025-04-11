package CalculadoraGeometrica;



import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionFigura, opcionOperacion;

        do {
            System.out.println("\n=== Calculadora Geométrica ===");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir");
            System.out.print("Seleccione una figura: ");
            opcionFigura = scanner.nextInt();

            if (opcionFigura == 6) {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break;
            }

            System.out.println("\nSeleccione la operación:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Opción: ");
            opcionOperacion = scanner.nextInt();

            switch (opcionFigura) {
                case 1 -> calcularCirculo(scanner, opcionOperacion);
                case 2 -> calcularCuadrado(scanner, opcionOperacion);
                case 3 -> calcularTriangulo(scanner, opcionOperacion);
                case 4 -> calcularRectangulo(scanner, opcionOperacion);
                case 5 -> calcularPentagono(scanner, opcionOperacion);
                default -> System.out.println("Opción no válida.");
            }
        } while (opcionFigura != 6);

        scanner.close();
    }

    private static void calcularCirculo(Scanner scanner, int operacion) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        if (operacion == 1) {
            double area = Math.PI * Math.pow(radio, 2);
            System.out.printf("Área del círculo: %.2f\n", area);
        } else {
            double perimetro = 2 * Math.PI * radio;
            System.out.printf("Perímetro del círculo: %.2f\n", perimetro);
        }
    }

    private static void calcularCuadrado(Scanner scanner, int operacion) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        if (operacion == 1) {
            double area = Math.pow(lado, 2);
            System.out.printf("Área del cuadrado: %.2f\n", area);
        } else {
            double perimetro = 4 * lado;
            System.out.printf("Perímetro del cuadrado: %.2f\n", perimetro);
        }
    }

    private static void calcularTriangulo(Scanner scanner, int operacion) {
        if (operacion == 1) {
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();
            double area = (base * altura) / 2;
            System.out.printf("Área del triángulo: %.2f\n", area);
        } else {
            System.out.print("Ingrese el lado 1 del triángulo: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Ingrese el lado 2 del triángulo: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Ingrese el lado 3 del triángulo: ");
            double lado3 = scanner.nextDouble();
            double perimetro = lado1 + lado2 + lado3;
            System.out.printf("Perímetro del triángulo: %.2f\n", perimetro);
        }
    }

    private static void calcularRectangulo(Scanner scanner, int operacion) {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        if (operacion == 1) {
            double area = base * altura;
            System.out.printf("Área del rectángulo: %.2f\n", area);
        } else {
            double perimetro = 2 * (base + altura);
            System.out.printf("Perímetro del rectángulo: %.2f\n", perimetro);
        }
    }

    private static void calcularPentagono(Scanner scanner, int operacion) {
        System.out.print("Ingrese el lado del pentágono: ");
        double lado = scanner.nextDouble();
        if (operacion == 1) {
            System.out.print("Ingrese el apotema del pentágono: ");
            double apotema = scanner.nextDouble();
            double area = (5 * lado * apotema) / 2;
            System.out.printf("Área del pentágono: %.2f\n", area);
        } else {
            double perimetro = 5 * lado;
            System.out.printf("Perímetro del pentágono: %.2f\n", perimetro);
        }
    }
}

