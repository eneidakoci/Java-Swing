package tezaShembullJava;

import java.util.*;

/*2. (10 pikë)Shkruani një metodë merrAkronim e cila kthen akronimin e një Stringu që e merr si parametër.
Për këtë do të përdoret karakteri # dhe jo hapësira duke supozuar që nuk do të ketë hapësira në String. Një
akronim përbëhet nga shkronja e parë e inputit String jo # dhe nga të gjithë karakteret jo thurrje që ndjekin
karakterin #. Për shembull metoda merrAkronim(“Not#a##Number”) do të kthejë NaN.*/
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

