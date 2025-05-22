public class Funcionario {
	String nomeAt;
	float rendaAt;
	
	public void mostrarNomeMet() {
		System.out.println(this.nomeAt);
	}
	public float mostrarRendaMet() {
		return this.rendaAt;
	}
	public void receberRendaMet(float valorPar) {
		this.rendaAt = this.rendaAt + valorPar;
	}
}
