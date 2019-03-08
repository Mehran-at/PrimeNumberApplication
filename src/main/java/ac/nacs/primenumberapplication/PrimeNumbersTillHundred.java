package ac.nacs.primenumberapplication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PrimeNumbersTillHundred {
    private final Integer max;

    Integer i = 2;

    public List<Integer> createPrimeList() {
        List<Integer> premiumNumbersFound = new ArrayList<>();
        while (premiumNumbersFound.size() < max) {
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
