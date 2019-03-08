//
//Backend specialization
//        week 2 - reflection
//        New Austrian Coding School
//        You are allowed to use internet resources but you’re not allowed to see other participants’ code.
//        Hand in the reflection before the specified deadline.
//        Writing unit tests is mandatory for every piece of logic of your applications.
//
//        Exercise
//        Create a bean that sums the first 100 prime numbers.
//        You should have at least the following production classes:
//        . Primes - tells you whether a number is prime or not
//        . PrimeAdder - receives the number of primes you want to sum and returns the sum of them
//        Hint:
//        > The sum of the first 100 prime numbers is 24133

        package ac.nacs.primenumberapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeNumberApplication {
    public static void main(String[] args) {
        //SpringApplication.run(PrimeNumberApplication.class, args);
        PrimeNumbersTillHundred primeNumbersTillHundred = new PrimeNumbersTillHundred(100);
        SumOfPrimeNumbers sumOfPrimeNumbers = new SumOfPrimeNumbers();
        System.out.println("First 100 prime numbers are: " + primeNumbersTillHundred.createPrimeList());
        System.out.println("The size of the list of prime numbers is " + (primeNumbersTillHundred.createPrimeList().size()));
        System.out.println("Sum of first hundred prime numbers is: " + sumOfPrimeNumbers.getSum());
    }
}