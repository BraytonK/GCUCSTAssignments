//By: Brayton Kerekffy
import java.io.File;
import java.util.Scanner;
public class main {
	public static void main(String args[]) throws Exception
    {
		StringBuilder sb = new StringBuilder();
		//insert your file here
		File file = new File("file"); 
		Scanner input = new Scanner(file);
		
		//change dimensions for array here
		int[] dimensions = {3,5};
		String[][] stringArr = new String[dimensions[0]][dimensions[1]];
		int counter = 0;
		int dimensionCount = 0;
		int dimensionParameter = 0;
		int maxDimensions = dimensions[0] - 1;
		
		while(input.hasNext()){
			String read = input.next();
			char[] inputCharArrConverter = read.toCharArray();
			for(char inputOut : inputCharArrConverter){
				if(counter < dimensions[1]){
					stringArr[dimensionCount][counter] = String.valueOf(inputOut);
					counter++;
					}
				else{
					if(dimensionCount < maxDimensions){
						dimensionCount++;
						counter = 0;
						stringArr[dimensionCount][counter] = String.valueOf(inputOut);
						counter++;
						}
					else{
						break;
						}
					}
				}
			if(counter >= dimensions[1] && dimensionCount < maxDimensions){
				dimensionCount++;
				counter = 0;
				}
			if(counter < dimensions[1]){
				stringArr[dimensionCount][counter] = "@";
				counter++;
			}
		}
		dimensionCount = 0;
		counter = 0;
		while(counter < dimensions[1]){
			System.out.print(stringArr[dimensionCount][counter]);
			dimensionCount++;
			if(dimensionCount > maxDimensions){
				dimensionCount = 0;
				counter++;
			}
		}
    }
}
