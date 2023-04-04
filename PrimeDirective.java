import java.util.ArrayList;

public class PrimeDirective{

    public boolean isPrime(int number){
        if (number ==2){
            System.out.println("Menor Número primo.");
            return true;
        }else if (number <2){
            System.out.println("Número nao primo");
            return false;
        }
        for (int i = 2; i < number; i++){
            if (number%i == 0){
                System.out.println("Numero nao primo");
                return false;
            }
        }
        System.out.println("Numero primo");
        return true;
    }
    public void onlyPrimes(ArrayList<Integer> numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();

    } 
    public static void main (String[]args){
        PrimeDirective prime = new PrimeDirective();
        prime.isPrime(7);
        prime.isPrime(28);
        prime.isPrime(2);
        prime.isPrime(0);
    }
}