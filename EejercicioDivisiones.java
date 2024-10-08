public class Eejercicio {

    public static void main(String[] args) {
        
        System.out.println("Bienevenido a Mattelsa");

        byte Tshirt = 25;
        byte pants = 30;
        double sale15 = 0.85;
        double sale5 = 0.95;

        double salepants = pants * sale15;
        double saletshirt = Tshirt * sale15;

        double totalsale = salepants + saletshirt;
        System.out.println("");

    }
}