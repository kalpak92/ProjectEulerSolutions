/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */

/**
 * ALGORITHM
 * We only need to divide by known primes, in order to check if the new number is a prime.
 * It is still using trial division, but we can limit the number of operations needed to check if a number is a prime.
 *
 * The downside of this approach is that we have to store all the found primes, which in this case means storing 10001 prime numbers.
 */

import java.util.*;

public class Problem007 {
    public static int getPrime(int n)
    {
        int high = n;
        int count = 1;
        boolean isPrime;
        int i;

        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        while(primes.size() < high)
        {
            count += 2;
            i = 0;
            isPrime = true;

            while(primes.get(i) * primes.get(i) <= count)
            {
                if(count % primes.get(i) == 0)
                {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if(isPrime)
                primes.add(count);
        }

        return primes.get(primes.size() - 1);
    }

    public static void main(String args[])
    {
        System.out.println("The 10001th prime number is: " + getPrime(10001));
    }
}
