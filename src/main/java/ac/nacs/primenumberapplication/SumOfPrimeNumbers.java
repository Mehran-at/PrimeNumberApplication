package ac.nacs.primenumberapplication;

import java.util.List;

public class SumOfPrimeNumbers {
    PrimeNumbersTillHundred primeNumbersTillHundred = new PrimeNumbersTillHundred(100);
    public Integer getSum() {
        List<Integer> primeList = primeNumbersTillHundred.createPrimeList();
        Integer sum = 0;
            for (int i = 0; i < primeList.size(); i++) {
                    sum = sum + primeList.get(i);
                   // primeNumbersTillHundred.createPrimeList().remove(0);
                }
            return sum;

        }
}
