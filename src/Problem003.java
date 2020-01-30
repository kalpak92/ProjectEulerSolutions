/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {
    public static long getLargestPrimeFactor(long  n)
    {
        int maxPrime = -1;


        // Divide by 2 to remove all the even composite factors.
        while(n % 2 == 0)
        {
            maxPrime = 2;
            n >>>= 1;
        }

        // Loop over the odd factors to remove the rest of the composites and updating maxPrime to the largest factor.
        for(int i = 3; i < Math.sqrt(n) + 1; i+=2)
        {
            while(n % i == 0)
            {
                maxPrime = i;
                n /= i;
            }
        }

        // Now if n > 2, then n must be prime else return maxPrime.
        return (n > 2) ? n : maxPrime;
    }

    public static void main(String args[])
    {
        long n  = 600851475143L;
        System.out.println("The Largest prime factor for 600851475143 is : " + getLargestPrimeFactor(n));
    }
}
