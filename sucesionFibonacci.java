public class sucesionFibonacci {
    public static void main(String[] args) {

        long firstsucesion = 0;
        long secondsucesion = 1;
        int sucesionfibonacci= 50;

        System.out.print(firstsucesion + ", " + secondsucesion + ", ");

        for(int i=3; i < sucesionfibonacci; i++){
            long thirdsusecion = firstsucesion + secondsucesion;
            System.out.print(thirdsusecion + ", " );

            firstsucesion= secondsucesion;
            secondsucesion= thirdsusecion;
        }
        
    }
}
    
   
            
        
    

