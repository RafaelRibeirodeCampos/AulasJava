
public class Gerente extends Individuo {
	private String setorAt;
	public Gerente (String nome, int renda, String setor) {
		Super(nome, renda);
		this.setorAt = setor;
	}
}
