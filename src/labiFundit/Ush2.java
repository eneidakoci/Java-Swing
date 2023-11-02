package labiFundit;
/*ush2: Shkruani nje prog qe lexon nga skedari ushtrim.txt dhe kalon fjalet ne nje
arraylist (ose strukture tjt). Afishoni fjalet nga arraylista sipas rendit qe jane 
vendosur dhe ne rend te anasjellte. reverse
*/

import java.io.*;
import java.util.*;
public class Ush2 {
	public static void main(String[] args) throws FileNotFoundException {
		try{
			ArrayList<String> fjalet = new ArrayList<>();
			FileReader reader = new FileReader("ushtrim.txt");//lexohet 
			Scanner in = new Scanner(reader);
			String s="";//do mbaje fjalet qe afishohen ne console
			while(in.hasNext()) {
				s=in.next();//lexohet fjala
				fjalet.add(s);//shtohet ne arraylist
			}
			System.out.println(fjalet);//afishon ne rendin qe jane vendosur
			Collections.reverse(fjalet);//kthen ne rend te anasjellte.
			System.out.println(fjalet);//tani afishohen ne rend te anasjellte
			
		}catch(IOException e) {
			System.out.println("Ndodhi nje error");
		}finally {
			System.out.println("Blloku try-catch perfundoi");
		}
		
		
	}

}
