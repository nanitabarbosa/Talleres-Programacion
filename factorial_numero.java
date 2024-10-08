import java.util.Scanner;

public class factorial_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero del cual desea conocer su factorial: ");
        int number = scanner.nextInt();
        int number1= number;
        int number2 = number-1;

        while (number2 > 0) {
            number1 *= number2;
            number2--;
        }
        System.out.println("El factorial del numero " + number + " es: " + number1);

        scanner.close();
    }
    
}
