package jana60.bank;

import java.util.Random;

public class Conto {
	
	private int nrConto;
	private String nome;
	private int saldo;
	
	Random rnd = new Random();
	
	public Conto() {}
	
	public Conto(String nome) {
		
		nrConto = rnd.nextInt(1001);
		setNome(nome);
		saldo = 0;
	}
	
	public int getNrConto() {
		
		return nrConto;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public int getSaldo() {
		
		return saldo;
	}
	
	
	public void deposito(int sommaDeposito) {
		
		this.saldo += sommaDeposito;
		System.out.println("Il tuo saldo attuale è: " + getSaldo() + "$");
	}
	
	public void prelevare(int sommaPrelievo) {
		
		if (sommaPrelievo <= 0) {
			
			System.out.println("Il numero non è valido");
		}
		else if (saldo == 0) {
			
			System.out.println("Il suo saldo è 0$, non puoi prelevare");
		}
		else if (saldo < sommaPrelievo){
			
			System.out.println("Il tuo saldo è inferiore alla somma desiderata. Il tuo saldo è: " + getSaldo() + "$");			
		}
		else {
			
			this.saldo = saldo - sommaPrelievo;
			System.out.println("Prielievo effettuato. Il tuo saldo ora è: " + getSaldo() + "$");
		}
	}
	
	
	@Override
	public String toString() {
		
		return "| Nome conto: " + getNome() +
				" | Numero conto: " + getNrConto() +
				" | Saldo: " + getSaldo() + "$ |";
	}
	
	
}
