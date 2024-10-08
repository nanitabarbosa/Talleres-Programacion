import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean resultado = true;
        while (resultado) {

            System.out.print("""
                              menu
                    1.  Triangulo
                    2.  Cuadrado
                    3.  Rectangulo

                    ingrese el numero de la funcion a realizar:
                    """);

            int codigo = scanner.nextInt();

            if (codigo == 1) {
                final int DENOMINADOR_TRIANGULO = 2;
                System.out.println("Ingrese la base: ");
                float base = scanner.nextFloat();
                System.out.println("Ingresen la altura: ");
                float altura = scanner.nextFloat();
                float areaTriangulo = (base * altura) / DENOMINADOR_TRIANGULO;
                System.out.println("El Area del triangulo es: " + areaTriangulo);

            } else if (codigo == 2) {
                System.out.println("Ingrese el lado: ");
                float lado1 = scanner.nextFloat();
                float areaCuadrado = lado1 * lado1;
                System.out.println("El area del cuadrado es: " + areaCuadrado);

            } else if (codigo == 3) {
                System.out.println("Ingrese la base: ");
                float base = scanner.nextFloat();
                System.out.println("Ingrese la altura: ");
                float altura = scanner.nextFloat();
                float areaRectangulo = base * altura;
                System.out.println("El area del triangulo es: " + areaRectangulo);

            } else {
                System.out.println("Numero ingresado no esta en el menu");

            }
            scanner.nextLine();


            System.out.println("¿Desea ingresar otra funcion?");
            String Condicion = scanner.nextLine();
            if (Condicion.equalsIgnoreCase("si")) {
                resultado = true;

            } else if (Condicion.equalsIgnoreCase("no")) {
                resultado = false;
                System.out.println("MUCHAS GRACIAS");

            } else {
                System.out.println("No identificado");
                resultado = false;

            }
        }

    }
}
