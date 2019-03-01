package ac.nacs.primenumberapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeNumberApplication {
    public static void main(String[] args) {
        PrimeNumbersTillHundred primeNumbersTillHundred = new PrimeNumbersTillHundred();
        SpringApplication.run(PrimeNumberApplication.class, args);
//        System.out.println("Prime numbers till hundred are: " + primeNumbersTillHundred.findPrimeNumbers());
//        System.out.println(("Size of the prime numbers till hundred: " + primeNumbersTillHundred.findPrimeNumbers().size()));
        System.out.println("Prime numbers from 1 to " + primeNumbersTillHundred.maxCheck + " are: " + primeNumbersTillHundred.createPrimeString());
        System.out.println("The size of the list of prime numbers is " + (primeNumbersTillHundred.createPrimeString().size()));
    }
}