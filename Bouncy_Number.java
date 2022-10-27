/*Bouncy Numbers: A number is said to be Bouncy number if the digits of the number are unsorted.
For example,
22344 - It is not a Bouncy number because the digits are sorted in ascending order.
774410 - It is not a Bouncy number because the digits are sorted in descending order.
155349 - It is a Bouncy number because the digits are unsorted.
A number below 100 can never be a Bouncy number.

Below is a program to check if a number is Bouncy or not.
*/

import java.util.*;

public class Bouncy_Number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if (n < 100)
        {
            System.out.println(n + " is not a Bouncy Number.");
            return;
        }
        int t = n;
        boolean isIncreasing = true, isDecreasing = true;
        int prev = t % 10;
        while (t != 0)
        {
            int d = t % 10;
            if (d > prev)
            {
                isIncreasing = false;
                break;
            }
            prev = d;
            t /= 10;
        }
        t = n;
        prev = t % 10;
        while (t != 0)
        {
            int d = t % 10;
            if (d < prev)
            {
                isDecreasing = false;
                break;
            }
            prev = d;
            t /= 10;
        }
        if (!isIncreasing && !isDecreasing)
            System.out.println(n + " is a Bouncy Number.");
        else
            System.out.println(n + " is not a Bouncy Number.");
    }
}