//By: Brayton Kerekffy
import java.util.Scanner;
import java.io.*; 
public class main {
	public static void main(String args[]) throws Exception
    {
		StringBuilder sb = new StringBuilder();
		File file = new File("C:\\Users\\kerek\\Desktop\\piglatin.txt"); 
		Scanner input = new Scanner(file);

		String pigLatin = "";
		String midWord;
		String consonant = "";
		char firstChar = 0;
		Boolean consonantPig = false;
	
		while(input.hasNext()){
			midWord = "";
			Boolean vowelPig = true;
			Boolean isConsonant = false;
			int counter = 0;
			String word = input.next();
			char[] inputCharArrConverter = word.toCharArray();
			for(char inputOut : inputCharArrConverter){
				consonantPig = false;
				counter++;
				inputOut = Character.toUpperCase(inputOut);
			
				if(counter == 1){
					firstChar = inputOut;
					if(inputOut == 'A' || inputOut == 'E' || inputOut == 'I' || inputOut == 'O' || inputOut == 'U'){
							pigLatin = word.toUpperCase() + "WAY";
							vowelPig = false;
							break;
						}
				}
				if(counter == 2){
					consonant = String.valueOf(firstChar) + String.valueOf(inputOut);
					if(consonant.equals("BR") || consonant.equals("CH") || consonant.equals("CL") || consonant.equals("CR") || consonant.equals("BL") || consonant.equals("DR") || consonant.equals("FL") || consonant.equals("FR") || consonant.equals("GL") || consonant.equals("GR") || consonant.equals("PL") || consonant.equals("PR") || consonant.equals("SC") || consonant.equals("SH") || consonant.equals("SK") || consonant.equals("SL") || consonant.equals("SM") || consonant.equals("SN") || consonant.equals("SP") || consonant.equals("ST") || consonant.equals("SW") || consonant.equals("TH") || consonant.equals("TR") || consonant.equals("TW") || consonant.equals("WH")){
						consonantPig = true;
						isConsonant = true;
						}
					else{
						midWord = midWord + inputOut;
					}
				}
				if(counter > 2){
					if(consonantPig == true){
						System.out.print("skip!");
						break;
					}
					else{
						midWord = midWord + inputOut;
					}
				}
		}
			if(vowelPig != false){
				if(isConsonant == true){
					pigLatin = midWord + consonant + "AY";
				}
				else{
					pigLatin = midWord + firstChar + "AY";
				}
			}
			System.out.printf("%-10s%-10s\n", word, pigLatin);
			}
    }
}
