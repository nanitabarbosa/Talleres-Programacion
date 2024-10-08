import java.util.Arrays;
import java.util.Scanner;
public class anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las dos palabras a comparar: ");
        String palabra1 = scanner.nextLine(); 
        String palabra2 = scanner.nextLine();
        boolean resultado;

        if (palabra1.equalsIgnoreCase(palabra2)){
            resultado = false;
            
        } else{
            char[] letra1 = palabra1.toLowerCase().toCharArray();
            char[] letra2 = palabra2.toLowerCase().toCharArray();

            Arrays.sort(letra1);
            Arrays.sort(letra2);

            resultado = Arrays.equals(letra1, letra2);
        }

        System.out.println("""
                ********                
                """ + resultado);        

        if (resultado){
            System.out.println("es un anagrama");

        } else{
            System.out.println("no es un anagrama");
        }

        scanner.close();




        
    }
    
}
