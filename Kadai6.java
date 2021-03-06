import java.util.Scanner;

public class Kadai6 extends Lee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//文字列の入力
		String str = sc.nextLine();
		
		sc.close();
		
		//文字列を一文字ごとに分割
		String splitArray[] = str.split("");
		
		//一文字ごとにLee変換をし出力する
		for(String s : splitArray){
			s = Lee.leechange(s);
			System.out.print(s);
		}
	}
}
class Lee{
	public static String leechange(String s) {
	//文字の置換
		if(s.equals("A")){//条件に一致するか判別
			s = s.replace("A","4");//Lee変換を行う
		}
		if(s.equals("E")){
			s = s.replace("E","3");
		}
		if(s.equals("G")){
			s = s.replace("G","6");
		}
		if(s.equals("I")){
			s = s.replace("I","1");
		}
		if(s.equals("O")){
			s = s.replace("O","0");
		}
		if(s.equals("S")){
			s = s.replace("S","5");
		}
		if(s.equals("Z")){
			s = s.replace("Z","2");
		}
		return s;
	}
}