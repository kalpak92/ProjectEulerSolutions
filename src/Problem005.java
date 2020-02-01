/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem005 {

    /**
     * Algorithm:
     *
     * If you observe carefully the result must be the LCM of the numbers 1 to n.
     *
     * To find LCM of numbers from 1 to n –
     *
     * Initialize result = 1.
     *
     * Iterate over all the numbers from i = 1 to i = n.
     *
     * At the i’th iteration result = LCM(1, 2, …….., i). This can be done easily as LCM(1, 2, …., i) = LCM(result, i).
     *
     * Thus at i’th iteration we just have to do –
     *          result  = LCM(ans, i)
     *                  = ans * i / gcd(ans, i) [Using the below property,
     *                                          a*b = gcd(a,b) * lcm(a,b)]
     */

    public static long getGcd(long a, long b)
    {
        if(a % b != 0)
            return  getGcd(b, a%b);
        else
            return  b;
    }

    public static long getLcm(long n)
    {
        long result = 1;
        for(int i = 1; i <= n; i++)
        {
            result = (result * i)/(getGcd(result, i));
        }
        return result;
    }

    public static void main(String args[])
    {
        long n = 20;
        System.out.println("The Smallest positive number that is evenly divisible by all numbers 1 to 20 is: " + getLcm(n));
    }
}
