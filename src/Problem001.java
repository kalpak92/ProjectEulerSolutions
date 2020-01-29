/**
 * Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 {
    public static int solution1(int n)
    {
        int sum = 0;

        for(int i = 0, j = 0, k = 0; i < n; i++)
        {
            if(j == 3 && k == 5)
            {
                sum += i;
                //System.out.println(i);
                j = 0;
                k = 0;
            }
            else if(j == 3)
            {
                sum += i;
                //System.out.println(i);
                j = 0;
            }
            else if(k == 5)
            {
                sum += i;
                //System.out.println(i);
                k = 0;
            }
            j++;
            k++;
        }
        return sum;
    }

    public static void main(String args[])
    {
        System.out.println("The Sum of all multiples of 3 and 5 is : " + solution1(1000));
    }
}
