/*Pairs Of Amicable Numbers: The smallest pair of amicable numbers is (220, 284). Because:
The divisor of 220 are: 1,2,4,5,10,11,20,22,44,55,and 110How to find Nth Highest Salary in
SQL
The sum of divisor of 220 is = 284
The divisor of 284 are: 1,2,4,71,142
The sum of divisor of 284 is = 220
We observe that the sum of the divisors of the first number is equal to the second number,
and the sum of divisor of the second number is equal to the first number. Hence, the given
pair (220, 284) is an amicable pair.
Example of Amicable pairs are (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232,
6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).

Below is a program to check if the given pair of number are Amicable or not.
*/

import java.util.Scanner;
public class Amicable_Number_Pair
{
    public static void main (String args[])
    {
        int firstDivisorSum = 0, secondDivisorSum = 0, firstNumber, secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = sc.nextInt();
        for(int i=1;i<firstNumber;i++)
        {

            if(firstNumber % i == 0)
            {
                firstDivisorSum = firstDivisorSum + i;
            }
        }
        for(int i=1;i<secondNumber;i++)
        {
            if(secondNumber % i == 0)
            {
                secondDivisorSum = secondDivisorSum + i;
            }
        }
        if((firstNumber == secondDivisorSum) && (secondNumber == firstDivisorSum))
        {
            System.out.println(firstNumber+", "+ secondNumber +" are amicable numbers.");
        }
        else
        {
            System.out.println(firstNumber+", "+ secondNumber +" are not amicable numbers.");
        }
    }
}