import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ýÀÚ ÀÔ·ÂÇØ ");
		int a = sc.nextInt();
		int b,c=0;
		for(int i = 0; i < 10; i ++) {
			b=(int)(Math.random()*50+1);
			System.out.print(b+" ");
			
			if(a==b) {
				c++;
			}
			
		}
		if(c>0) {
			System.out.println("\n¤º¤»¤º¤»");
		}
		else System.out.println("\n²Î");
	}
}
//12345

