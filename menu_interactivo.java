import java.util.Scanner;
public class menu_interactivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
                Menu de Operaciones
                ------------------------
                1. sumar
                2. restar
                3. multiplicar
                4. dividir
                """);
                System.out.println("Ingrese el numero de la operacion que desea realizar:" );
                int opcion = scanner.nextInt();
                System.out.println("Ingrese los numeros para hacer la operacion4: " );
                double number1 = scanner.nextInt();
                double number2 = scanner.nextInt();

                switch (opcion) {
                    case 1: System.out.println("la suma es. " + (number1 + number2));
                    break;
                    case 2: System.out.println("la resta es: " + (number1 - number2));
                    break;
                    case 3: System.out.println("La muktiplicacion es: " + (number1 * number2));
                    break;
                    case 4: if (number2 != 0) {
                        System.out.println("Resultado: " + (number1 / number2));
                    } else {
                        System.out.println("Error: División por cero");
                    }
                    break;
                    
                    default:
                    System.out.println("La opcion no esta dentro del menu ");
                        break;
                }
                scanner.close();
    }
}
