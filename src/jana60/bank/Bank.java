package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome per creare il tuo nuovo conto bancario: ");
		String nome = sc.nextLine();
		
		Conto contoUtente = new Conto(rnd.nextInt(1,1000),nome);

		int sceltaUtente = -1;
		
		while(sceltaUtente != 3) {
			
			System.out.println("Cosa vuoi fare? \n 0-versare somma \n 1-prelevare somma \n -2 informazioni conto \n -3 uscire");
			sceltaUtente = sc.nextInt();		
			
			if(sceltaUtente == 0) {
				
				System.out.println("quanto vuoi versare?: ");
				float cifraVersare = sc.nextFloat();
				
				contoUtente.versare(cifraVersare);
				
				System.out.println(contoUtente.getSaldo());
				
			}else if(sceltaUtente == 1) {
				
				System.out.println("quanto vuoi prelevare?: ");
				float cifraPrelevare = sc.nextFloat();
				
				contoUtente.prelevare(cifraPrelevare);
				
				System.out.println(contoUtente.getSaldo());
				
			}else if(sceltaUtente == 2) {
				
				System.out.println(contoUtente);
				
			}		
		}
		
		sc.close();
	}
}
