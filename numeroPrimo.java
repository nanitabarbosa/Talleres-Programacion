import java.util.Scanner;

public class numeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Verificar si un número ingresado es primo
        System.out.print("Introduce un número para verificar si es primo: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " es un número primo.");
        } else {
            System.out.println(number + " no es un número primo.");
        }

        // Parte 2: Imprimir todos los números primos entre 1 y 100
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Método que determina si un número es primo
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }

        // Verificamos si es divisible por algún número entre 2 y la raíz cuadrada de num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si es divisible por algún número, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }
}



