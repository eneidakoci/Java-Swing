package lab8_9;
import java.util.*;

public class Libri {
	private String autori;
	private String titulli;
	private int isbn;
	private String lloji;
	private int cmimi;
	private int nrFaqeve;
	private ArrayList<String> librat = new ArrayList<>();
	
	public Libri(String autori, String titulli, int isbn, String lloji, int cmimi, int nrFaqeve) {
		this.autori = autori;
		this.titulli = titulli;
		this.isbn = isbn;
		this.lloji = lloji;
		this.cmimi = cmimi;
		this.nrFaqeve = nrFaqeve;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

	public String getTitulli() {
		return titulli;
	}

	public void setTitulli(String titulli) {
		this.titulli = titulli;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getLloji() {
		return lloji;
	}

	public void setLloji(String lloji) {
		this.lloji = lloji;
	}

	public int getCmimi() {
		return cmimi;
	}

	public void setCmimi(int cmimi) {
		this.cmimi = cmimi;
	}

	public int getNrFaqeve() {
		return nrFaqeve;
	}

	public void setNrFaqeve(int nrFaqeve) {
		this.nrFaqeve = nrFaqeve;
	}
	
	//metoda per te shfaqur librat ne liste
	public void shfaq_librat(ArrayList<String> librat){
		for(String s: librat) {
			System.out.println(s+" ");
		}
	}
	
	//kerko nje liber ne liste
	public boolean kerko(String libri) {
		if(librat.contains(libri)) {
			return true;
		}
		return false;
	}
	
	//shtimi i nje libri ne liste
	public ArrayList<String> shto(String shto_ne_liste){
		librat.add(shto_ne_liste);
		return librat;
	}
	
	//heqja e nje libri ne liste
	public ArrayList<String> hiq(String hiq_nga_lista){
		librat.remove(hiq_nga_lista);
		return librat;
	}
	
	//dalja nga programi
	public void exit() {
		exit();
	}
	
	
}
