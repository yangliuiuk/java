/*
Write a program to display the first 50 prime numbers. 
An integer greater than 1 is prime if its only positive divisor is 1 or itself. 

Below is a sample run: 

2 3 5 7 11 13 17 19 23 29 
31 37 41 43 47 53 59 61 67 71 
73 79 83 89 97 101 103 107 109 113 
127 131 137 139 149 151 157 163 167 173 
179 181 191 193 197 199 211 223 227 229

*/

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; count < 50; number ++){
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number - 1; divisor ++ ){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(number + " ");
                count ++;
                if (count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
