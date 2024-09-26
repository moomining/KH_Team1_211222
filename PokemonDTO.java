package pokemonAdeventure;

public abstract class PokemonDTO {
	protected String name;
	protected int HP = 100;
	protected int mission = (int)(Math.random()*3)+3;
	protected int count = 0;
	
	public abstract void recharge();
	
	public abstract void attack();
	
	public abstract void PokemonDTO();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}
	
	
	
}
