import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasseRegEx {


	public static void main(String[] args) {
		
		String texto = "roberto2025@gmail.com";
		String password = "123456";
		
		Pattern subtextoPadrao = Pattern.compile("[a-zA-Z0-9_#-]{1}[a-zA-Z0-9_#-]+@gmail.com");
		Pattern padraoSenha = Pattern.compile("[0-9]");
		
		Matcher combina = subtextoPadrao.matcher(texto);
		Matcher combina2 = padraoSenha.matcher(password);
		
		if(combina.matches()) {
			System.out.println("Validado!");
			
		}else{
			
			System.out.println("Não validado!");
		}
		if(combina2.matches()) {
			System.out.println("Validado!");
			
		}else{
			
			System.out.println("Não validado!");
		}

	}


}
