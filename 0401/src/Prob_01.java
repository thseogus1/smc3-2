import java.util.Scanner;

public class Prob_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Grade me = new Grade();
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		
		me.math = sc.nextInt();
		me.science = sc.nextInt();
		me.english = sc.nextInt();
		
		System.out.println("����� "+me.average(me.math, me.science, me.english));
	
		
	}
}

class Grade{
	public int math;
	public int science;
	public int english;
	
	public int average(int math, int science, int english){
		return (math+science+english)/3;
	}
	
	
	
	
	
}