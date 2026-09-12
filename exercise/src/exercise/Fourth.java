package exercise;
import java.util.Scanner;

public class Fourth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("個数入れて");
		int size = scanner.nextInt();
	
		int[]numbers = new int[size];
		
		for(int i = 0; i < size; i++) {
			numbers[i] = (int)(Math.random()*30)+1;
		}
		
		System.out.println("生成された数字は");
		
		for(int i = 0; i < size; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		
		for(int i = 0; i < size - 1; i++) {
			
			for(int j = i +1; j < size; j++) {
				
				if(numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		System.out.println("大きい順に並べると、");
		
		for(int i = 0; i < size; i++) {
			System.out.print(numbers[i]+" ");		
	}
	//scannerを閉じる
	scanner.close();
}
}
