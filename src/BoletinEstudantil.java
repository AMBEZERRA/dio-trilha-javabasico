import java.util.Scanner;

public class BoletinEstudantil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o Valor da Média:");

		int mediaFinal = sc.nextInt();
		if (mediaFinal < 6)
			System.out.println("Aluno REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else if (mediaFinal > 6)
			System.out.println("APROVADO");
	}
}
