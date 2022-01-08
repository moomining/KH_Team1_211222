package pokemonAdeventure;

import java.util.Scanner;

public class Pikachu extends PokemonDTO {

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(this.HP < 100) {
			System.out.println("피카츄의 HP가 100% 충전되었습니다.");
			this.HP = 100;
		} else {
			System.out.println("피카츄의 HP가 완충되어 있습니다. 2를 눌러 공격을 진행해주세요.");
			
		}
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		if (HP >= 50) { 
			System.out.println("피카츄가 전기를 쏩니다. 치지직===ZZ");
			HP -= 30;
			count++;
			System.out.println("피카츄가 " + count+"회 공격을 시행했습니다.");
			System.out.println("피카츄의 현재 HP는 " + HP + "입니다." );
			
			if (mission == count) {
				Scanner sc = new Scanner(System.in);
				System.out.print("진화 미션 회수를 모두 채우셨습니다. 진화를 진행하시겠습니까? (y/n) : ");
				String yesOrNo = sc.nextLine();
				label:
				if(yesOrNo.equals("y")) {
					System.out.println("피카츄가 라이츄로 진화했습니다. 축하드립니다.");
					return;
				} else if (yesOrNo.equals("n")) {
					System.out.println("프로그램을 종료합니다.");
					return;
				} else {
					System.out.println("y/n 중 하나만을 입력해야합니다. 다시 입력해주세요.");
					break label;
				}
				
			}
		} else { 
			System.out.println("충전이 필요합니다. 충전을 시행합니다.");
			recharge();
		}
		
	}

	@Override
	public void PokemonDTO() {
		// TODO Auto-generated method stub
		
	}

}
