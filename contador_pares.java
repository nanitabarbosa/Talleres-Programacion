public class contador_pares {
    public static void main(String[] args) {
        var contador= 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0) {
                contador++;
            }
        }
        
        System.out.println("La cantidad de numeros primes es: " + contador);

    }
    
}
