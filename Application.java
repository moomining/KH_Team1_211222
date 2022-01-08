package pokemonAdeventure;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임을 함께할 포켓몬을 선택해 주세요. ");
		System.out.print("1. 피카츄 2. 파이리 3. 꼬부기 : ");
		int pokeSelect = sc.nextInt();
		sc.nextLine();
		String poke = "";
		switch (pokeSelect) {
		case 1 : 
			poke = "피카츄";
			Pikachu pika = new Pikachu();
			System.out.println("미션! " + pika.mission + "회 공격하여 " + poke +"를 진화시켜라.");
			while (true) {
				System.out.println(poke + "가 수행할 동작 고르기 : ");
				System.out.print("1. 충전 / 2. 공격 / 9. 게임 종료 (번호 입력) : ");
				int num = sc.nextInt();
				switch (num) {
					case 1 : pika.recharge(); break;
					case 2 : pika.attack(); 
							
							break;
					case 9 : System.out.println("게임을 종료합니다."); return;
					default : System.out.println("잘못 입력하셨습니다. 다시 1,2,9 중 하나의 번호를 입력해주세요."); break;
					}
			}
		case 2 :
			poke = "파이리";
			Pairi pai = new Pairi();
			System.out.println("미션! " + pai.mission + "회 공격하여 " + poke +"를 진화시켜라.");
			while (true) {
				System.out.println(poke + "가 수행할 동작 고르기 : ");
				System.out.print("1. 충전 / 2. 공격 / 9. 게임 종료 (번호 입력) : ");
				int num2 = sc.nextInt();
					switch (num2) {
					case 1 : pai.recharge(); break;
					case 2 : pai.attack(); break;
					case 9 : System.out.println("게임을 종료합니다."); return;
					default : System.out.println("잘못 입력하셨습니다. 다시 1,2,9 중 하나의 번호를 입력해주세요."); break;
					}
			}
		
		case 3 :
			poke = "꼬부기";
			Ggobuki ggobuk = new Ggobuki();
			System.out.println("미션! " + ggobuk.mission + "회 공격하여 " + poke +"를 진화시켜라.");
			while (true) {
				System.out.println(poke + "가 수행할 동작 고르기 : ");
				System.out.print("1. 충전 / 2. 공격 / 9. 게임 종료 (번호 입력) : ");
				int num3 = sc.nextInt();
				
				switch (num3) {
					case 1 : ggobuk.recharge(); break;
					case 2 : ggobuk.attack(); break;
					case 9 : System.out.println("게임을 종료합니다."); return;
					default : System.out.println("잘못 입력하셨습니다. 다시 1,2,9 중 하나의 번호를 입력해주세요."); break;
				}
				
			}	
		}
		
		
	}


}
