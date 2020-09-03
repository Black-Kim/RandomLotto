package a_variable;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	// 로또 번호 랜덤 추출기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("로또 번호 랜덤 추출기 입니다.\n" + "생성 하고자 하는 갯수를 선택하세요.(0~6)");
		// randomValue = Math.random();
		int choose;
		int last = (int) Math.random();
		choose = Integer.parseInt(sc.nextLine());

		switch (choose) {
		case 1:
			last = (int) (ran.nextDouble() * 100);
			break;
		case 2:
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			break;
		case 3:
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			break;
		case 4:
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			break;
		case 5:
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			break;
		case 6:
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			last = (int) (ran.nextDouble() * 100);
			System.out.println(last);
			break;
		case 0:
			
			break;
		}

		// while(true){
		System.out.println("번호가 추출 되었습니다. \n행운을 빕니다.");

		// sc.nextLine();
		// break;
	}

}

// }

