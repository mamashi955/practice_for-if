package exercise;
import java.util.Scanner;

public class Third {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
	
		int i=1;
		while(i <= size) {
			int j =1;
			
			while(j <= size*2-1) {
				
			if(j<i) {
				System.out.print(" ");
		}
			
			if(j >= i && j <= (size*2-i)) {
				System.out.print("*");
			}
			j++;
	}
		System.out.println();
		i++;
	}
	//scannerを閉じる
	scanner.close();
}
}
