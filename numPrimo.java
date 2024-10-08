import java.util.Scanner;
public class numPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo o no: ");
        int numero = scanner.nextInt();

        int contador = 0;

        for(int i = 2; i <= numero; i++){
            if(numero % i == 0){
                contador++;

            }
        }
        if(contador <=1){
            System.out.println("El " + numero + " es un numero primo");

        }else{
            System.out.println("El " + numero + " no es un numero primo");
        }

        int max = 100;
        System.out.println("Los numeros Primos son: ");
    

        for(int i= 2; i<=max; i++ ){
            int contador2 = 0;
            for(int j = 2; j <= i; j++){
                if(i%j == 0){
                    contador2++;
                }
            }
            if(contador2 <=1){
                numerosPri
            }
        }
       





       

    }
}
