
public class primeNumber {
/*
* Project java find a number that is PrimeNumber
*  
*
* @By-Kongchan
*
*/
    public static void main(String[] args) {
        int number = 13;
        boolean isPrimeNumber = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
            }
        }
        if (isPrimeNumber) {
            System.out.println(number + " It's prime number");
        } else {
            System.out.println(number + " It's not prime number");
        }

    }
}
