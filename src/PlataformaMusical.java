import java.util.Scanner;

public class PlataformaMusical {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int musica1 = 0;
		int musica2 = 0;
		int musica3 = 0;
		System.out.println("Digite o número da música que quer ouvir de 1 a 3 ou 4 para finalizar: ");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				musica1 += 1;
				System.out.println("Você ouviu a música1");
			} else if (tipo == 2) {
				musica2 += 1;
				System.out.println("Você ouviu a música2");
			} else if (tipo == 3) {
				musica3 += 1;
				System.out.println("Você ouviu a música3");
			}

			tipo = sc.nextInt();
		}
		System.out.println("Obrigado por utilizar nossa plataforma de música");
		System.out.println("O número de ouvintes das muúsicas foram: ");
		System.out.println("musica1: " + musica1);
		System.out.println("musica2: " + musica2);
		System.out.println("musica3: " + musica3);

		sc.close();
	}
}
