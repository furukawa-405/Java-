package curriculum_B;

public class Qes2 {

	public static void main(String[] args) {
	//問1
	int score = 75;
    if (score >= 60) {
    System.out.println("合格です!");}
    
    //問2
    int age = 25;
    if (age >= 20)
    {System.out.println("適正年齢です");}
    else if (age <= 30) {System.out.println("適正年齢です");}
    else {System.out.println("対象外です");}
	
	//問3
    int Age = 18;
    if (Age >= 20) {System.out.println("成人です");}
    else if (Age >= 13 && Age <= 19) 
    {System.out.println("ティーンエイジャーです");}
    else if (Age <= 12) {System.out.println("子供です");}
	
    //問4
    int x = 30;
    int y = 15;
    int z = 50;
    int max;
    if (x >= y && x >= z) { max = x;}
    else if (y >= x && y >= z) { max = y;}
    else { max = z;}
    System.out.println(max);
    
    //問5
    int num = 1;
    if (num > 0) {System.out.println("正の数です");}
    else if (num == 0) {System.out.println("0です");}
    else if (num < 0) {System.out.println("負の数です");}
	
    //問6
    int value = 2;
    if(value % 2 == 0) {System.out.println("偶数です");}
    else {System.out.println("奇数です");}
    
    //問7
    int Score = 10;
    if (Score >= 90){System.out.println("優");}
    else if (Score >= 70 && Score <90){System.out.println("良");}
    else if (Score >= 50 && Score <70){System.out.println("可");}
    else if (Score >= 0 && Score <50){System.out.println("不可");}
	
    //問8
    String a = "";
    if (a == ""){System.out.println("入力が無効です");}
	
    
	
	
	}
}
