/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
import java.io.*;
import java.util.*;
public class Problem004 {

    public static int getLargestPalindrome(int n) {
        int d1 =  (int)(Math.pow(10, n) - 1);
        int max_product = 0;

        while(d1 > Math.pow(10, n-1))
        {
            int d2 = d1;

            while(d2 > Math.pow(10, n-1))
            {
                if (d1 * d2 < max_product)
                    break;

                if(isPalindrome(d1*d2) && d1*d2 > max_product)
                {
                    max_product = d1 * d2;
                    //System.out.println("Max Prod : " + max_product);
                }

                d2 --;
            }
            d1 --;
        }

        return (max_product);
    }

    public static boolean isPalindrome(int num) {
        int n = num;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        //System.out.println("reverse : " +reverse);
        return (n == reverse) ? true : false;
    }

    public static void main(String args[])
    {
        System.out.println("The Largest palindrome is : " + getLargestPalindrome(3));
    }
}
