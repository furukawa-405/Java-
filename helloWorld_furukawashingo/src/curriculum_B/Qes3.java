package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes3 {

	public static void main(String[] args) {

		//問1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		//問2
		for (int a = 2; a <= 20; a += 2) {
			System.out.println(a);
		}

		//問3
		for (int b = 10; b >= 1; b--) {
			System.out.println("カウントダウン:" + b);
		}

		//問4
		int c = 0;
		for (int d = 1; d <= 100; d++) {
			c += d;
		}
		System.out.println(c);

		//問5
		//配列を使った場合
		String[] a = { "*", "**", "***", "****", "*****" };
		for (String b : a) {
			System.out.println(b);
		}
		//配列を使わなかった場合
		String str = "*";
		for (int f = 0; f < 5; f++) {
			System.out.println(str);
			str += "*";
		}

		//問6
		int e = 1;
		while (e <= 10) {
			System.out.println(e);
			e++;
		}

		//問7
		int g = 2;
		while (g <= 20) {
			System.out.println(g);
			g += 2;
		}

		//問8
		int h = 10;
		while (h >= 1) {
			System.out.println("カウントダウン" + h);
			h--;
		}

		//問9
		int z = 1;
		int k = 0;
		while (z <= 100) {
			k += z;
			z++;
		}
		{
			System.out.println(k);
		}

		//問10
		Scanner scanner = new Scanner(System.in);
		int l;
		while (true) {
			l = scanner.nextInt();
			if (l == 0) {
				System.out.println("終了しました");
				break;
			} else {
				System.out.println(l);
			}
		}

		//問11
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j < 9) {
					System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = "
							+ String.format("%02d", i * j) + " || ");
				} else {
					System.out.println(String.format("%02d", i) + " * " + String.format("%02d", j) + " = "
							+ String.format("%02d", i * j));
					System.out.println();
				}
			}
		}

		//問12
		String text = scanner.nextLine();
		String[] texts = text.split("、");
		Random random = new Random();
		int tvNumber = random.nextInt(12);
		int displayNumber = 11 - tvNumber;
		for (String i : texts) {
			int randomNumber = random.nextInt(12);
			switch (i) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
				System.out.println(i + "の残り台数は" + randomNumber + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(i.equals("テレビ") ? i + "の残り台数は" + tvNumber + "台です" : i + "の残り台数は" + displayNumber + "台です");
				break;
			default:
				System.out.println("『" + i + "』は指定の商品ではありません");
		scanner.close();
			}
		}
	}
}
