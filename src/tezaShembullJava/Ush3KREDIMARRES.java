package tezaShembullJava;

import java.util.*;

/*Nd�rtoni klas�n KrediMarr�s ku �do instanc� e k�saj klase paraqet nj� marr�s dokumentesh t�
autorizuar p�r t� marr� dokumenta. �do kredimarr�s do t� ket� emrin dhe nj� list� t� gjith� kredive. Kjo
klas� do t� ket�: nj� konstruktor q� merr si paramet�r nj� String dhe inicializon kredimarr�sin nd�rsa lista e
kredive q� ka marr� �sht� bosh; metod�n merrEm�r q� kthen emrin e kredimarr�sit; metod�n gjejKredi() e
cila merr si paramet�r numrin e kredis� dhe kthen nj� tip Kredije duke k�rkuar n� list�n e kredive t�
kredimarr�sve p�r t� gjetur numrin. N�se kjo kredi ekziston metoda do ta kthej� at�; metod�n shto kredi e
cila merr si paramet�r element�t e kredis� dhe n�se ajo kredi nuk ekziston e shton at�*/
public class Ush3KREDIMARRES {

	public String emri;
	public ArrayList<Ush3KREDI> kredite;
	
	public Ush3KREDIMARRES(String emri) {
		this.emri=emri;
		this.kredite=null;
	}
	
	public String merrEmer() {
		return emri;
	}
	
	public Ush3KREDI gjejKredi(String nrDok) {
		Ush3KREDI k = null;
		for(int i=0; i<kredite.size(); i++) {
			k = kredite.get(i);
			String nr = k.merrNumer();
			if(nr.equals(nrDok)) {
				return k;
			}else {
				kredite.add(k);
			}
		}
		return k;
	}
	
	//metod�n shto kredi e cila merr si paramet�r element�t e kredis� dhe n�se ajo kredi nuk ekziston e shton at�
	
	public void shtoKredi(Ush3KREDIMARRES kredimarres, String nrDok, Date data, boolean status) {
		Ush3KREDI kredia = new Ush3KREDI(kredimarres, nrDok, data, status);
		for(int i=0; i<kredite.size(); i++) {
			Ush3KREDI find = kredite.get(i);
			if(!find.equals(kredia)) {
				kredite.add(kredia);
				System.out.println("U shtua "+kredia+" ne sistem");
			}
		}
	}
	
	
}
