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
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number: numbers){
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;

    } 
    public static void main (String[]args){
        int[] numerosprimos = {7, 28, 2, 0};
        PrimeDirective prime = new PrimeDirective();
        ArrayList<Integer> novosNumeros = prime.onlyPrimes(numerosprimos);
        System.out.println(novosNumeros);
    }
}