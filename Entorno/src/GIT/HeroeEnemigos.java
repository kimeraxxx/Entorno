package GIT;

public class HeroeEnemigos {

	private Heroe enemigo;
	private byte idEnemigos;

	public HeroeEnemigos(Heroe heroe, byte idEnemigos) {
			super();
			this.enemigo = heroe;
			this.idEnemigos = idEnemigos;
		}

	public byte getIdEnemigos() {
		return idEnemigos;
	}

	public Heroe getHeroes() {
		return enemigo;
	}
}
