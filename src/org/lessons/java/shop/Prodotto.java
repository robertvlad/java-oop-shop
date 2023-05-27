package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto() {};
	
	Random rnd = new Random();
	
	public Prodotto(String nome, String descrizione, double prezzo, double iva) {
		
		codice = rnd.nextInt(100000000);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		
		return codice;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getDescrizione() {
		
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() {
		
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		
		this.prezzo = prezzo;
	}
	
	public double getIva() {
		
		return iva;
	}
	
	public void setIva(double iva) {
		
		this.iva = iva;
	}
	
	
	public double prezzoIva() {
		
		return prezzo * iva;
	}
	
	public String nomeEsteso() {
		
		return barCodice() + "-" + nome;
	}
	
	public String barCodice() {
		
		String strCodice = "" + codice;
		
		int strLng = strCodice.length();
		
		String barCodice = strCodice;
		
		if (strLng < 8) {
			
			int barLng = 8 - strLng;
			
			for (int i = 0; i < barLng; i++) {
				
				barCodice = "0" + barCodice;
			}
		}
		
		return barCodice;
	}
	
	
	@Override
	public String toString() {

		return "Il codice del prodotto è: " + barCodice() + 
				" | Nome: " + getNome() +
				" | Nome esteso: " + nomeEsteso() +
				" | Descrizione: " + getDescrizione() + 
				" | Prezzo senza Iva: " + getPrezzo() + 
				" | Prezzo con " + getIva() + "% di iva: " + String.format("%.2f$", prezzoIva());
	}
}
