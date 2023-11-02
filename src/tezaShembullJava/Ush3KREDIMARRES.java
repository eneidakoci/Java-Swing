package tezaShembullJava;

import java.util.*;

/*Ndërtoni klasën KrediMarrës ku çdo instancë e kësaj klase paraqet një marrës dokumentesh të
autorizuar për të marrë dokumenta. Çdo kredimarrës do të ketë emrin dhe një listë të gjithë kredive. Kjo
klasë do të ketë: një konstruktor që merr si parametër një String dhe inicializon kredimarrësin ndërsa lista e
kredive që ka marrë është bosh; metodën merrEmër që kthen emrin e kredimarrësit; metodën gjejKredi() e
cila merr si parametër numrin e kredisë dhe kthen një tip Kredije duke kërkuar në listën e kredive të
kredimarrësve për të gjetur numrin. Nëse kjo kredi ekziston metoda do ta kthejë atë; metodën shto kredi e
cila merr si parametër elementët e kredisë dhe nëse ajo kredi nuk ekziston e shton atë*/
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
	
	//metodën shto kredi e cila merr si parametër elementët e kredisë dhe nëse ajo kredi nuk ekziston e shton atë
	
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
