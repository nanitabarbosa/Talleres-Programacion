public class fizzbuzz {
    public static void main(String[] args) {
        System.out.println("Fizz Buzz");
        int number [] = new int[100];

        for(int i=1; i < number.length; i++){
            if (i % 3 == 0 ){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if ( i % 5 == 0 && i % 3 ==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
            }
        }

        }
    
    
