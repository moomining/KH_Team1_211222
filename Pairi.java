package pokemonAdeventure;

import java.util.Scanner;

public class Pairi extends PokemonDTO {

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(this.HP < 100) {
			System.out.println("[system] : 파이리의 HP가 100% 충전되었습니다.");
			this.HP = 100;
		} else {
			System.out.println("[system] : 파이리의 HP가 완충되어 있습니다. 공격을 진행해주세요.");
			
		}
	}

	@Override
	public void attack() {
		
		if (HP >= 50) { 
			System.out.println("[system] : 파이리(이)가 불을 뿜습니다. 화르륵==33");
			HP -= 30;
			count++;
			System.out.println("[system] : 파이리(이)가 " + count+"회 공격을 수행했습니다.");
			System.out.println("[system] : 파이리의 현재 HP는 " + HP + "입니다." );
			
			if (mission == count) {
				Scanner sc = new Scanner(System.in);
				System.out.print("[system] : 진화 미션 횟수를 모두 채우셨습니다. 진화를 진행하시겠습니까? (y/n) : ");
				String yesOrNo = sc.nextLine();
				label:
				if(yesOrNo.equals("y")) {
					System.out.println("[system] : 파이리(이)가 리자몽으로 진화했습니다. 축하드립니다.");
					return;
				} else if (yesOrNo.equals("n")) {
					System.out.println("[system] : 진화를 못해 화가난 파이리가 다 불태워 게임이 종료됩니다.");
					return;
				} else {
					System.out.println("[system] : y/n 중 하나만을 입력해야합니다. 다시 입력해주세요.");
					break label;
				}
				
			}
		} else { 
			System.out.println("[system] : 파이리의 hp가 모자라 공격이 불가합니다. 충전을 진행하세요!");
			recharge();
		}
	}

	@Override
	public void PokemonDTO() {
		// TODO Auto-generated method stub
		
	}

}
