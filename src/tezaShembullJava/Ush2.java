package tezaShembullJava;

import java.util.*;

/*2. (10 pik�)Shkruani nj� metod� merrAkronim e cila kthen akronimin e nj� Stringu q� e merr si paramet�r.
P�r k�t� do t� p�rdoret karakteri # dhe jo hap�sira duke supozuar q� nuk do t� ket� hap�sira n� String. Nj�
akronim p�rb�het nga shkronja e par� e inputit String jo # dhe nga t� gjith� karakteret jo thurrje q� ndjekin
karakterin #. P�r shembull metoda merrAkronim(�Not#a##Number�) do t� kthej� NaN.*/
public class Ush2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Jepni nje string");
		String s = scan.nextLine();
		
	
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if((c == '#') && (s.charAt(i+1) !='#')) {
				System.out.print(s.charAt(i+1));
			}
			
		}
		
		scan.close();
	}
}

