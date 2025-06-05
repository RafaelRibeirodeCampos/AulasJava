
public class Individuo {
	private String nomeAt;
	private int rendaAt;
	public Individuo(String nome, int renda) {
		this.nomeAt = nome;
		this.rendaAt = renda;
	}
	public void mostarNome() {
		System.out.println(this.nomeAt);
	}
	public void mostarRenda() {
		System.out.println(this.rendaAt);
	}
}
