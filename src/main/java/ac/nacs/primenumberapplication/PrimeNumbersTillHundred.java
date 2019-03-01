package ac.nacs.primenumberapplication;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PrimeNumbersTillHundred {
    Integer i = 2;

    public List<Integer> createPrimeString() {
        List<Integer> premiumNumbersFound = new ArrayList<>();
        while (premiumNumbersFound.size()<100) {
                if (checkPrime(i)) {
                    premiumNumbersFound.add(i);
                }
            i++;
        }
        return premiumNumbersFound;
    }

    public boolean checkPrime(int num) {
        int remainder;
        for (int i = 2; i <= num /2; i++) {
            remainder = num % i;
            if (remainder == 0) {
                return  false;
            }
        }return true;
    }
}
