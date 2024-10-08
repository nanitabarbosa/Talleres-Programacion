import java.util.Scanner;
public class tabla_multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de la tabla de multiplicar: ");
        int tabla = scanner.nextInt();

        for (int i=0; i<= 10; i++) {
            int resultado = tabla * i;
        System.out.println(tabla + "*" + i + "=" + resultado);
        }
        scanner.close();
    }
}
