
public class MinhaClasse {

	public static void main(String[] args) {
		
		String primeiroNome = "Allisson";
		String segundoNome = "Lind�o";
		
		String nomeCompleto1 = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto(primeiroNome, segundoNome)); //M�todo
		System.out.println(nomeCompleto1); // vari�vel
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do M�todo" + primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
