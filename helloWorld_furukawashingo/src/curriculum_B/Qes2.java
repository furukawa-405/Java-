package curriculum_B;

public class Qes2 {

	public static void main(String[] args) {
	//問1
	int score = 75;
    if (score >= 60) {
    System.out.println("合格です!");}
    
    //問2
    int age = 25;
    if (age >= 20 && age <= 30) {
    	System.out.println("適正年齢です");
    } else {
		System.out.println("対象外です");
    }
    
	//問3
    int ag = 18;
    if (ag >= 20) {System.out.println("成人です");}
    else if (ag >= 13 && ag <= 19) 
    {System.out.println("ティーンエイジャーです");}
    else if (ag <= 12) {System.out.println("子供です");}
	
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
    String input = "";
    if (input == null || input.equals("")) {
    	System.out.println("入力が無効です");
    } else {
    	System.out.println(input);
    }
	
    //問9
    int day = 1;
    switch (day) {
    case 1:System.out.println("今日は月曜日です");
    break;
    case 2:System.out.println("今日は火曜日です");
    break;
    case 3:System.out.println("今日は水曜日です");
    break;
    case 4:System.out.println("今日は木曜日です");
    break;
    case 5:System.out.println("今日は金曜日です");
    break;
    case 6:System.out.println("今日は土曜日です");
    break;
    case 7:System.out.println("今日は日曜日です");
    break;
    default:System.out.println("入力無効な数字です");
    break;}
    
    //問10
    int month = 1; 
    switch (month) { case 1: System.out.println("冬");
    break;
    case 2 : System.out.println("冬");
    break;
    case 12: System.out.println("冬");
    break;
    case 3: System.out.println("春"); 
    break; 
    case 4: System.out.println("春"); 
    break; 
    case 5: System.out.println("春"); 
    break; 
    case 6: System.out.println("夏"); 
    break; 
    case 7: System.out.println("夏");
    break; 
    case 8: System.out.println("夏"); 
    break; 
    case 9: System.out.println("秋"); 
    break; 
    case 10: System.out.println("秋"); 
    break; 
    case 11: System.out.println("秋"); 
    break;
    default: System.out.println("無効な月です");}
	
	
	}
}
