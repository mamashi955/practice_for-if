package exercise;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

        // キーボードから数字を入力するためのScannerを作成
		Scanner scanner = new Scanner(System.in);

        // 入力された数字を取得
		int size = scanner.nextInt();

        // 0以下の数字が入力された場合はエラーメッセージを表示
		if (size <= 0) {
			System.out.println("1以上の数字を入力してください。");
			scanner.close();
			return;
		}

        // 入力された数字の行数だけ繰り返す
		int i = 1;
		while (i <= size) {

            // 1行に表示する「*」の数を1から開始
			int j = 1;

            // 行数と同じ数だけ「*」を表示
			while (j <= i) {

                // 「*」を1つ表示
				System.out.print("*");

                // 「*」の数を1つ増やす
				j++;
            }

            // 1行分の表示が終わったら改行
			System.out.println();

            // 行数を1つ増やす
			i++;
		}

        // Scannerを閉じる
		scanner.close();
	}
}