package exercise;

import java.util.Scanner;

public class Second {

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

            // 1行に表示する位置を1から開始
			int j = 1;

            // 1行分の文字を表示する
			while (j <= size) {

                // 行数より前の位置にはスペースを表示
				if (j < i) {
					System.out.print(" ");
				}

                // 行数以降の位置には「*」を表示
				if (j >= i) {
					System.out.print("*");
				}

                // 表示する位置を1つ進める
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