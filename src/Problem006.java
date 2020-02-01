/**
 * Problem 6
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem006 {
    public static long getDiff(int n)
    {
        long sum = 0;
        long squaredSum = 0;

        long result = 0;

        sum = (n * (n + 1))/2;
        squaredSum = (n * (n + 1) * (2*n + 1)) / 6;

        result = sum * sum - squaredSum;

        return result;
    }

    public static void main(String args[])
    {
        System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is : " + getDiff(100));
    }
}
