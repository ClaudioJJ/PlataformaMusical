import java.util.Scanner;

public class PlataformaMusical {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int musica1 = 0;
		int musica2 = 0;
		int musica3 = 0;
		System.out.println("Digite o n�mero da m�sica que quer ouvir de 1 a 3 ou 4 para finalizar: ");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				musica1 += 1;
				System.out.println("Voc� ouviu a m�sica1");
			} else if (tipo == 2) {
				musica2 += 1;
				System.out.println("Voc� ouviu a m�sica2");
			} else if (tipo == 3) {
				musica3 += 1;
				System.out.println("Voc� ouviu a m�sica3");
			}

			tipo = sc.nextInt();
		}
		System.out.println("Obrigado por utilizar nossa plataforma de m�sica4");
		System.out.println("O n�mero de ouvintes das mu�sicas foram: ");
		System.out.println("musica1: " + musica1);
		System.out.println("musica2: " + musica2);
		System.out.println("musica3: " + musica3);

		sc.close();
	}
}