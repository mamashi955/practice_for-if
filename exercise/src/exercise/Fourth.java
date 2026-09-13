package exercise;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {

        // キーボードから数字を入力するためのScannerを作成
		Scanner scanner = new Scanner(System.in);

        // 作成する数字の個数を入力
		System.out.print("個数を入れて：");
		int size = scanner.nextInt();

        // 0以下の数字が入力された場合はエラーメッセージを表示
		if (size <= 0) {
			System.out.println("1以上の数字を入力してください。");
			scanner.close();
			return;
		}

        // 指定された個数の乱数を作成
		int[] numbers = createNumbers(size);

        // 生成された数字を表示
		System.out.println("生成された数字は");
		printNumbers(numbers);

        // クイックソートで大きい順に並べ替える
		quickSort(numbers, 0, numbers.length - 1);

        // 並べ替えた数字を表示
		System.out.println("大きい順に並べると、");
		printNumbers(numbers);

        // Scannerを閉じる
		scanner.close();
	}

    // 指定された個数の乱数を作成する関数
	public static int[] createNumbers(int size) {

        // 指定された個数の配列を作成
		int[] numbers = new int[size];

        // 配列に1～30のランダムな数字を入れる
		for (int i = 0; i < size; i++) {
			numbers[i] = (int) (Math.random() * 30) + 1;
		}

		return numbers;
	}

    // 配列の数字を表示する関数
	public static void printNumbers(int[] numbers) {

        // 配列の数字を順番に表示
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
	}

    // クイックソートを行う関数
	public static void quickSort(int[] numbers, int left, int right) {

        // 左端が右端以上になったら終了
		if (left >= right) {
			return;
		}

        // 基準となる数字を配列の中央から決める
		int pivot = numbers[(left + right) / 2];

        // 左右から基準となる数字との比較を開始
		int i = left;
		int j = right;

        // 配列を基準値より大きい部分と小さい部分に分ける
		while (i <= j) {

            // 大きい順なので、基準値より大きい数字を探す
			while (numbers[i] > pivot) {
				i++;
			}

            // 基準値より小さい数字を探す
			while (numbers[j] < pivot) {
				j--;
			}

            // 左側と右側の数字を入れ替える
			if (i <= j) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;

				i++;
				j--;
			}
		}

        // 左側をクイックソート
		if (left < j) {
			quickSort(numbers, left, j);
		}

        // 右側をクイックソート
		if (i < right) {
			quickSort(numbers, i, right);
		}
	}
}
