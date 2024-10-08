import java.util.Scanner;

public class proyecto_mini {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calcular la media");
        System.out.println("Ingrese el primer numero ");
        double numFirst = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero ");
        double numSecond = scanner.nextDouble();
        System.out.println("Ingrese el tercer numero ");
        double numThird = scanner.nextDouble();

        double operation = (numFirst + numSecond + numThird) /3;
        System.out.println("La media de los numeros ingresados es: " + operation);
        scanner.close();



    }
}