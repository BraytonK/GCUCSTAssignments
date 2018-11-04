import java.util.Random;

public class main {
	public static void main(String[] args){
		
	}
	public static class linkedList{
		Random rand = new Random();
		int arr[] = new int [6];
		int arrayInsert = 0;
		int variableHold = 0;
		
		linkedList(){}
			
		void generateArray(){
			for(int count; count < 5;  count++)
				arr[count] = rand.arrayInsert;
		}
		
		void push(int elements){
			for(int count = 0; count < 5;  count++){
				variableHold = arr[count];
				if(count == 0){
					arr[count] = elements;
				}
				
			}
				
		}
		void pushAll(){
			
		}
		void peek(){	
			
		}
		void pop(){
			
		}
		
	}
}
