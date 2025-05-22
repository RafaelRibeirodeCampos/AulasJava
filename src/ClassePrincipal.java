
public class ClassePrincipal {
	public static void main(String[]args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nomeAt = "Rafael";
		f1.mostrarNomeMet();
		f1.rendaAt = 10_000;
		f1.mostrarRendaMet();
		f1.receberRendaMet(15_000);
	}

}
