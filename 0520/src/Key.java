import java.util.Scanner;

public class Key {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		
		int a = sc.nextInt();
		int sum=0;
	
		for (int i=1; i<=a; i++){
			if(i%3==0 && i%2!=0){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("1~"+a+"���� 3�� ����̸鼭 Ȧ���� ���� ���� 27�Դϴ�.");

	}

}
