package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		// 問１
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;
		
		//問２
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		//問3
		System.out.println(longNum+intNum+shortNum+byteNum);
		System.out.println(byteNum+byteNum);
		System.out.println(letter+letters+isBoolean);
		System.out.println(byteNum+shortNum+intNum+longNum+floatNum+doubleNum);
		System.out.println(longNum*intNum*shortNum*byteNum);
		System.out.println(doubleNum/shortNum);
		System.out.println(byteNum-shortNum);
		
		//問4
		String name = "山田太郎";
		String greeting = "こんにちは、";
		String mark = "さん！";
		System.out.println(greeting+name+mark);
		
		//問5
		int age = 25;
		String f = "年齢:";
		char g = '歳';
		System.out.println(f+age+g);
		
		//問6
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		//問7
		int score = 80;
		score += 20;
		System.out.println(score);
		
		//問8
		double price = 99.99;
        int intPrice = (int) price;
        System.out.println("整数価格: " + intPrice);
        
        //問9
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        System.out.println("変換後の値: " + (num + 10));
        
        //問10
        int Num = 50;
        String nUmStr = Integer.toString(Num);
        System.out.println("得点: " + nUmStr + "点");
        
        //問11
        int a = 10;
        int b = 20;
        boolean result = a < b;
        System.out.println(result);
        
        //問12
        int x = 15;
        String Result = (x >= 10) ? "OK" : "NG";
        System.out.println(Result);
        
        //問13
        String text = "私はJavaが好きです。Javaは楽しい！";
        String replaced = text.replace("Java", "Python");
        System.out.println(replaced);
	}

}
