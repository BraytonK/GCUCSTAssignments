//Created By: Brayton Kerekffy
//CST105 Project 2
import java.util.Scanner;
public class main 
{
    public static void main(String args[])
    {
        int inputNum;
        int remainder;
        int sum = 0;
        int count = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5-digit positive integer:");
        inputNum = input.nextInt();
        while(count <= 5)
        {
            remainder = inputNum % 10;
            sum = sum + remainder;
            inputNum = inputNum / 10;
            count++;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}