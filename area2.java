import java.util.Scanner;

public class area2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu
                1. Triangulo
                2. Cuadrado
                3. Resctangulo
                """);
        System.out.println("Ingrese el codigo de la funcion a realizar: ");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("ingrese la base: ");
                float base = scanner.nextFloat();
                System.out.println("ingrese la altura: ");
                float altura = scanner.nextFloat();
                final int DENOMINADOR_TRIANGULO = 2;
                float areaTriangulo = (base * altura) / DENOMINADOR_TRIANGULO;
                System.out.println("el area del triangulo es: " + areaTriangulo);
                break;
            case 2:
                System.out.println("Ingrese el lado: ");
                float lado = scanner.nextFloat();
                float areaCuadrado = lado * lado;
                System.out.println("el area del triangulo es :" + areaCuadrado);
                break;

            case 3:
                System.out.println("Ingrese la base: ");
                float baseRectangulo = scanner.nextFloat();
                System.out.println("Ingrese la altura: ");
                float alturaRectangulo = scanner.nextFloat();
                float areaRectangulo = baseRectangulo * alturaRectangulo;
                System.out.println("el area del rectangulo es: " + areaRectangulo);
                break;

            default:
                System.out.println("Codigo no encontrado");
                break;
        }

    }

}
