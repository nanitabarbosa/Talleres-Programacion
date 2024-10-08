public class cuentaBancaria {
    public static void main(String[] args) {
        
        int totalAccount = 1000;
        int WEEKS_RETREAT = 200;
        byte weeksMonth= 4;
        int totalRetreat = totalAccount -(WEEKS_RETREAT * weeksMonth);


        System.out.println("El total de su cuenta finalizando el mes es de: " + "$" + totalRetreat);


    }
    
}
