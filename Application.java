package pokemonAdeventure;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[system] : " + "내 이름은 오박사, 포켓몬스터의 세계에 잘 왔다! 키울 수 있는 포켓몬들을 보여주마.");           
		System.out.println("[system] : " + "1. 피카츄 2. 파이리 3. 꼬부기");                                                     
		System.out.println("-----------------------------------");                                                    
		System.out.print("[system] : " + "키우실 포켓몬에 해당하는 숫자를 입력해 주세요 : "); 
		int pokeSelect = sc.nextInt();
		sc.nextLine();
		String poke = "";
		switch (pokeSelect) {
		case 1 : 
			poke = "피카츄";
			Pikachu pika = new Pikachu();
			System.out.println("[system] : " + "미션! " + pika.mission + "회 공격하여 " + poke +"를 진화시켜라.");
			while (true) {
				
				System.out.println("[system] : " + poke + "와의 상호작용을 위한 메뉴를 선택해주세요 ");               
				System.out.println("[system] : " + "1. 충전하기 / 2. 공격하기 / 9. 게임 종료하기");                    
				System.out.print("[system] : " + "수행하실 메뉴에 해당하는 숫자를 입력해주세요 : "); 
				int num = sc.nextInt();
				switch (num) {
					case 1 : pika.recharge(); break;
					case 2 : pika.attack(); 
							
							break;
					case 9 : System.out.println("[system] : " + "게임을 종료합니다."); return;
					default : System.out.println("[system] : " + "해당하는 메뉴는 존재하지 않습니다. 1,2,9 중 하나의 번호를 입력해주세요."); break;
					}
			}
		case 2 :
			poke = "파이리";
			Pairi pai = new Pairi();
			System.out.println("[system] : " + "미션! " + pai.mission + "회 공격하여 " + poke +"를 진화시켜라.");
			while (true) {
				System.out.println("[system] : " + poke + "와의 상호작용을 위한 메뉴를 선택해주세요 ");               
				System.out.println("[system] : " + "1. 충전하기 / 2. 공격하기 / 9. 게임 종료하기");                    
				System.out.print("[system] : " + "수행하실 메뉴에 해당하는 숫자를 입력해주세요 : "); 
				int num2 = sc.nextInt();
					switch (num2) {
					case 1 : pai.recharge(); break;
					case 2 : pai.attack(); break;
					case 9 : System.out.println("[system] : " + "게임을 종료합니다."); return;
					default : System.out.println("[system] : " + "해당하는 메뉴는 존재하지 않습니다. 1,2,9 중 하나의 번호를 입력해주세요."); break;
					}
			}
		
		case 3 :
			poke = "꼬부기";
			Ggobuki ggobuk = new Ggobuki();
			System.out.println("[system] : " + "미션! " + ggobuk.mission + "회 공격하여 " + poke +"를 진화시켜라.");
			while (true) {
				System.out.println("[system] : " + poke + "와의 상호작용을 위한 메뉴를 선택해주세요 ");               
				System.out.println("[system] : " + "1. 충전하기 / 2. 공격하기 / 9. 게임 종료하기");                    
				System.out.print("[system] : " + "수행하실 메뉴에 해당하는 숫자를 입력해주세요 : "); 
				int num3 = sc.nextInt();
				
				switch (num3) {
					case 1 : ggobuk.recharge(); break;
					case 2 : ggobuk.attack(); break;
					case 9 : System.out.println("[system] : " + "게임을 종료합니다."); return;
					default : System.out.println("[system] : " + "해당하는 메뉴는 존재하지 않습니다. 1,2,9 중 하나의 번호를 입력해주세요."); break;
				}
				
			}	
		}
		
		
	}


}
