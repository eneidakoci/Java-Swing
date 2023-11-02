package rekursion;

public class Trekendesh {

	private int gjeresi;
	//krijon nje forme trekendeshi
	public Trekendesh(int gjeresi) {
		this.gjeresi = gjeresi;
	}
	
	//gjen siperfaqen e trekendeshit
	public int gjejSip() {
		if(gjeresi <= 0) {
			return 0;
		}
		else if(gjeresi == 1) {
			return 1;
		}
		else {
			Trekendesh smallerTriangle = new Trekendesh(gjeresi - 1);
			int smallerArea = smallerTriangle.gjejSip();
			return smallerArea + gjeresi;
		}
	}
}
