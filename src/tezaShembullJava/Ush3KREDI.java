package tezaShembullJava;

import java.util.*;

/* Nd�rtoni nj� klas� Kredi ku �do instanc� e k�saj klase ruan informacion mbi detajet e kredive
q� merren nga persona. �do objekt Kredi duhet t� ket� atributet: kredimarr�s, numrin e dokumentit (String)
q� do t� merret, dat�n e kthimit, statusin e kthimit t� kredis� q� do t� jet� i v�rtet� ose i gabuar. Klasa duhet
t� ket� metodat: Konstruktor me parametra; Metod�n merrKredimarr�s() q� kthen referenc�n e nj� objekti
kredimarr�s t� k�saj kredije; merrNum�r() q� kthen numrin e k�saj kredie; merrDat�Kthimi() q� kthen
referenc�n e objektit Date q� paraqet dat�n e kthimit t� kredis�; metod�n boolean-e �sht�Kthyer() pa
parametra q� tregon n�se kredija �sht� kthyer ose jo.*/

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
