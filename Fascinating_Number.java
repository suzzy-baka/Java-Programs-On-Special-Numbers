/*Fascinating Numbers: Some numbers of 3 digits or more exhibit a very interesting
property. The property is such that, when the number is multiplied by 2 and 3, and both
these products are concatenated with the original number, all digits from 1 to 9 are present
exactly once, regardless of the number of zeroes.
Let's understand the concept of Fascinating Number through the following example:
Consider the number 192
192 x 1 = 192
192 x 2 = 384
192 x 3 = 576
Concatenating the results: 192 384 576
It could be observed that '192384576' consists of all digits from 1 to 9 exactly once. Hence,
it could be concluded that 192 is a Fascinating Number. Some examples of fascinating
Numbers are: 192, 219, 273, 327, 1902, 1920, 2019 etc.
Q

Below is a program to check if a number is Fascinating or not.
*/

import java.util.*;

public class Fascinating_Number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = in.nextInt();

        if (num < 100)
        {
            System.out.println(num + " is not a Fascinating Number");
            return;
        }
        int num2 = num * 2;
        int num3 = num * 3;

        boolean isFascinating = true;
        String str = "" + num + num2 + num3;
        for (char i = '1'; i <= '9'; i++)
        {
            int idx1 = str.indexOf(i);
            int idx2 = str.lastIndexOf(i);
            if (idx1 == -1 || idx1 != idx2)
            {
                isFascinating = false;
                break;
            }
        }
        if (isFascinating)
            System.out.println(num + " is a Fascinating Number");
        else
            System.out.println(num + " is not a Fascinating Number");
    }
}