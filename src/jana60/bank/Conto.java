package jana60.bank;

public class Conto {
	
	private int numeroConto;
	private String nomeProprietario;
	private float saldo;	
	
	public Conto(int numeroConto, String nomeProprietario) {
		
		this.saldo = 0;
		this.numeroConto = numeroConto;
		this.nomeProprietario = nomeProprietario;		
	}
	
	
	public int getNumeroConto() {
		
		return this.numeroConto;
	}
	
	public float getSaldo() {
		
		return this.saldo;
	}
	
	public String getNomeProprietario() {
		
		return this.nomeProprietario;
	}
	
	public void setNomeProprietario(String nomeProprietario) {
		
		this.nomeProprietario = nomeProprietario;
	}
	
	
	public void versare(float sommaDaVersare) {
		
		this.saldo += sommaDaVersare;		
	}
	
	public void prelevare(float sommaDaPrelevare) {
		
		float saldoArrivare = 0;
		
		saldoArrivare = this.saldo - sommaDaPrelevare;
		
		if(this.saldo > 0 && saldoArrivare >= 0) {
			
			this.saldo -= sommaDaPrelevare;
			
		}else {
			
			System.out.println("impossibile continuare saldo in negativo");
		}
		
	}
	
	@Override
	public String toString() {
		
		return "nome : " + getNomeProprietario() + " numero conto : " + getNumeroConto() + " saldo : " + getSaldo();
	}
}
