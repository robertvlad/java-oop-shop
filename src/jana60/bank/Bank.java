package jana60.bank;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A quale nome vuoi aprire il tuo conto?");		
		String nome = sc.nextLine();
		
		Conto newConto = new Conto(nome);
		
		System.out.println(newConto);
		
		int risp = -1;
		
		while (risp != 3) {
			
			System.out.println("Premere: 1 per prelevare, 2 per depositare, 3 per uscire.");
			risp = sc.nextInt();
			
			if (risp == 1) {
				
				System.out.println("Quanto vuoi prelevare?");
				int prel = sc.nextInt();
				
				newConto.prelevare(prel);
			}
			else if (risp == 2) {
				
				System.out.println("Quanto vuoi depositare?");
				int dep = sc.nextInt();
				
				newConto.deposito(dep);
			}			
		}
		
		System.out.println("Grazie ed arrivederci!");
		
		sc.close();
	}
	
}
