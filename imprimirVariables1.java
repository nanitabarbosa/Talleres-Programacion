//Se abre la libreria para pedir datos por consola
import java.util.Scanner;

public class imprimirVariables1
 {
    public static void main(String[] args) {

        //Se le va a asignar valor a Scanner "leer"
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número");

        //se asigna el tipo de variable que se va a utilizar
        int numero1 = leer.nextInt();


        // al next se le asigna el tipo de variable que se copio al principio.
        System.out.println("ingrese otro numero decimal");
        double numero2 = leer.nextDouble();

        //necesito hacer un salto de linea, ya que siempre que vaya a iniciar un line (caracter) necesito limpiar el buffer
        leer.nextLine();

        //Vamos a pedir una fila de caracter (para el string se utiliza el Line)
        System.out.println("ingrese su nombre: ");
        String userName = leer.nextLine();

        System.out.println("Ingrese su apellido");
        String lastName = leer.nextLine();

        //muestro las variables
        float suma = (float)(numero1 + numero2);

        System.out.println("Suma los dos numero: " + suma );

        System.out.println("Mi nombre es: " + userName + " " + lastName);

        //cierro la libreria
        leer.close();






        
    }

}