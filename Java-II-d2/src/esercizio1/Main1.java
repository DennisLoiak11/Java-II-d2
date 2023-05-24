package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		Set<String> setParole = new HashSet<String>();

		boolean continua = true;

		do {
			try {
				System.out.println("Inserisci il numero di elementi seguito dal tasto Invio. Inserisci 0 per terminare");

				Scanner scanner = new Scanner(System.in);

				int numElementi = Integer.valueOf(scanner.nextLine());				

				if (numElementi == 0) {
					continua = false;
				} else {
					for (int i = 0; i < numElementi; i++) {
						System.out.println("Inserisci una parola seguita dal tasto Invio");
						String parola = scanner.nextLine();

						boolean parolaAggiunta = setParole.add(parola);

						if (!parolaAggiunta) {
							System.out.println("Parola duplicata: " + parola);
						}
					}

					System.out.println("Numero parole distinte: " + setParole.size());

					System.out.println("Parole distinte: ");
				
					for (String parolaCorrente : setParole) {
						System.out.println("- " + parolaCorrente);
					}

					setParole.clear();
				}

			} catch (Exception e) {
				System.out.println("Errore nella procedura riprendere dall'inizio");

				setParole.clear();
			}

		} while (continua == true);
		System.out.println("Programma terminato");

	}

}