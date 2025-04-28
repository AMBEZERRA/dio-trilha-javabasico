
public class MinhaClasse {

	public static void main(String[] args) {
		
		String primeiroNome = "Allisson";
		String segundoNome = "Lindão";
		
		String nomeCompleto1 = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto(primeiroNome, segundoNome)); //Método
		System.out.println(nomeCompleto1); // variável
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do Método" + primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
