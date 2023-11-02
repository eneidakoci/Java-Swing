package tezaShembullJava;

import java.util.*;

/* Ndërtoni një klasë Kredi ku çdo instancë e kësaj klase ruan informacion mbi detajet e kredive
që merren nga persona. Çdo objekt Kredi duhet të ketë atributet: kredimarrës, numrin e dokumentit (String)
që do të merret, datën e kthimit, statusin e kthimit të kredisë që do të jetë i vërtetë ose i gabuar. Klasa duhet
të ketë metodat: Konstruktor me parametra; Metodën merrKredimarrës() që kthen referencën e një objekti
kredimarrës të kësaj kredije; merrNumër() që kthen numrin e kësaj kredie; merrDatëKthimi() që kthen
referencën e objektit Date që paraqet datën e kthimit të kredisë; metodën boolean-e ështëKthyer() pa
parametra që tregon nëse kredija është kthyer ose jo.*/

public class Ush3KREDI {

	private Ush3KREDIMARRES kredimarres;
	private String nrDok;
	private Date data;
	private boolean status;
	
	public Ush3KREDI(Ush3KREDIMARRES kredimarres, String nrDok, Date data, boolean status) {
		this.kredimarres=kredimarres;
		this.nrDok=nrDok;
		this.data=data;
		this.status=status;
	}
	
	public Ush3KREDIMARRES merrKredimarres() {
		return this.kredimarres;//mqs thote kthen referencen
	}
	
	public String merrNumer() {
		return nrDok;
	}
	
	public Date merrDatekthimi() {
		return this.data;
	}
	
	public boolean eshteKthyer() {
		return status;
	}
	
	
}
