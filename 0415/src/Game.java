import java.util.Scanner;
	

public class Game {
	public static void game(int user,int com) {
		System.out.println("\n---------- ���� ���� �� ----------");
		switch(user) {
			case 1:  if(user == com) {
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("���º�");
			}
			else if(com==2) {
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("�����ϴ�");
			}
			else if(com==3) {
				System.out.println("[��: ����] VS [��ǻ��: ��]");
				System.out.println("�̰���ϴ�");
			}
				break;
			case 2:
			if(user == com) {
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				  System.out.println("���º�");
			}
			else if(com==3) {
				System.out.println("[��: ����] VS [��ǻ��: ��]");
				System.out.println("�����ϴ�");
			}
			else if(com==1) {
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("�̰���ϴ�");
			}
		break;
		case 3:
			if(user == com) {
				System.out.println("[��: ��] VS [��ǻ��: ��]");
				  System.out.println("���º�");
			}
			else if(com==1) {
				System.out.println("[��: ��] VS [��ǻ��: ����]");
				System.out.println("�����ϴ�");
			}
			else if(com==2) {
				System.out.println("[��: ��] VS [��ǻ��: ����]");
				System.out.println("�̰���ϴ�");
			}
		break;
		default : System.out.println("�߸��Է�");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[1: ���� 2:���� 3:��] ");
		
		int user = sc.nextInt();
		int com = (int)(Math.random()*3+1);
		game(user, com);
		
	}
}
