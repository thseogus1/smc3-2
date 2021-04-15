import java.util.Scanner;
	

public class Game {
	public static void game(int user,int com) {
		System.out.println("\n---------- 가위 바위 보 ----------");
		switch(user) {
			case 1:  if(user == com) {
				System.out.println("[나: 가위] VS [컴퓨터: 가위]");
				System.out.println("무승부");
			}
			else if(com==2) {
				System.out.println("[나: 가위] VS [컴퓨터: 바위]");
				System.out.println("졌습니다");
			}
			else if(com==3) {
				System.out.println("[나: 가위] VS [컴퓨터: 보]");
				System.out.println("이겼습니다");
			}
				break;
			case 2:
			if(user == com) {
				System.out.println("[나: 바위] VS [컴퓨터: 바위]");
				  System.out.println("무승부");
			}
			else if(com==3) {
				System.out.println("[나: 바위] VS [컴퓨터: 보]");
				System.out.println("졌습니다");
			}
			else if(com==1) {
				System.out.println("[나: 바위] VS [컴퓨터: 가위]");
				System.out.println("이겼습니다");
			}
		break;
		case 3:
			if(user == com) {
				System.out.println("[나: 보] VS [컴퓨터: 보]");
				  System.out.println("무승부");
			}
			else if(com==1) {
				System.out.println("[나: 보] VS [컴퓨터: 가위]");
				System.out.println("졌습니다");
			}
			else if(com==2) {
				System.out.println("[나: 보] VS [컴퓨터: 바위]");
				System.out.println("이겼습니다");
			}
		break;
		default : System.out.println("잘못입력");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[1: 가위 2:바위 3:보] ");
		
		int user = sc.nextInt();
		int com = (int)(Math.random()*3+1);
		game(user, com);
		
	}
}
