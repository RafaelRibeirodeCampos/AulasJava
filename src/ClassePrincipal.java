
public class ClassePrincipal {
	public static void main(String[]args) {
		Pessoas objetoPessoa1 = new Pessoas();
		Pessoas objetoPessoa2 = new Pessoas();
		
		objetoPessoa1.receberNomeMet("Mel");
		objetoPessoa1.receberRendaMet(15_000);
		
		objetoPessoa2.receberNomeMet("Ryan");
		objetoPessoa2.receberRendaMet(15_000);
		
		objetoPessoa1.mostrarNomeMet();
		objetoPessoa1.mostrarRendaMet();
		
		objetoPessoa2.mostrarNomeMet();
		objetoPessoa2.mostrarRendaMet();
		
		Funcionario objetoFuncionario1 =  new Funcionario();
		objetoFuncionario1.receberNomeMet("Miguel");
		objetoFuncionario1.receberRendaMet(50_000);
		objetoFuncionario1.cargoAt = "CEO";
	}

}
