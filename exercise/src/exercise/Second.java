package exercise;
import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
	
		int i=1;
		while(i <= size) {
			int j =1;	
			while(j <= size) {
			if(j<=i) {
				System.out.print(" ");
		}
			if(j >= i) {
				System.out.print("*");
			}
			j++;
	}
		System.out.println();
		i++;
	}
	scanner.close();
}
}
