import java.util.Scanner; //importo scanner
public class Ejercicio_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new  int[5]; //defino arreglo
        int suma = 0;

        for (int i=0; i< numeros.length; i++) {
        System.out.print("Ingrese el numero de la posicion " + i + ":");
        numeros[i] = scanner.nextInt();
        suma+=numeros[i]; //contador 
        }


        double promedio = suma/(double)numeros.length;
        System.out.println("el promedio es: " + promedio);
    
        scanner.close();  
    }
}

