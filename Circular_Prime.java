/*Circular Prime: A Circular Prime is a prime number that remains prime under cyclic shifts of its digits.
When the leftmost digit is removed and replaced at the end of the remaining string of
digits, the generated number is still prime. The process is repeated until the original
number is reached again.
A number is said to be prime if it has only two factors 1 and itself.
Example:
131
311
113
Hence, 131 is a circular prime.

Below is a program to check if a number is Circular Prime or not.
*/

import java.util.Scanner;

public class Circular_Prime
{
    public static boolean isPrime(int num)
    {
        int c = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                c++;
        return c == 2;
    }
    public static int getDigitCount(int num)
    {
        int c = 0;
        while (num != 0)
        {
            c++;
            num /= 10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int n = in.nextInt();
        if (n <= 0)
        {
            System.out.println("Invalid Input!");
            return;
        }
        boolean isCircularPrime = true;
        if (isPrime(n))
        {
            System.out.println(n);
            int digitCount = getDigitCount(n);
            int divisor = (int)(Math.pow(10, digitCount - 1));
            int n2 = n;
            System.out.println("The prime numbers formed after interchanging the digits are: ");
            for (int i = 1; i < digitCount; i++)
            {
                int t1 = n2 / divisor;
                int t2 = n2 % divisor;
                n2 = t2 * 10 + t1;
                System.out.println(n2);
                if (!isPrime(n2))
                {
                    isCircularPrime = false;
                    break;
                }
            }
        }
        else
            isCircularPrime = false;
        if (isCircularPrime)
            System.out.println(n + " is a Circular Prime");
        else
            System.out.println(n + " is not a Circular Prime.");
    }
}