//Ny:Brayton Kerekffy for CST Project 7
import java.util.Scanner;
public class main {
	public static void main(String[] args){
		
		int[] nums = new int[100000];
		for(int counter=0;counter<10000;){
			counter++;
			nums[counter] = counter;
			if(checkPrime(counter) == true && checkPalidromic(counter) == true){
				System.out.println(nums[counter] + " is Palidromic Prime");
			}
		
		}
	}
	public static boolean checkPrime(int number){
	    if (number % 2 == 0 && number != 2) {
	        return false;
	    }

	    int primeSqrt = (int)Math.sqrt(number);
	    int counter = 3;
	    while(counter <= primeSqrt){
	    	if (number % counter == 0) {
	            return false;
	        }
	    	counter +=2;
	    }

	    return true;
	}
	public static boolean checkPalidromic(int number) { 
		 String reverse = ""; // Objects of String class
	     String numberString = Integer.toString(number);
	     int length = numberString.length();
	     int counter = length - 1;
	     while(counter >= 0){
	        reverse = reverse + numberString.charAt(counter);
	        counter--;
	     }
	     if (numberString.equals(reverse))
	        return true;
	     else
	        return false;
	}     
	
}
